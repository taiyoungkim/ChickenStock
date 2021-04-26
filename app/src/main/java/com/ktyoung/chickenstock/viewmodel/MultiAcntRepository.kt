package com.ktyoung.chickenstock.viewmodel

import android.content.res.Resources
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.ktyoung.chickenstock.api.model.CorpModel
import com.ktyoung.chickenstock.api.model.MultiAcntApiModel
import com.ktyoung.chickenstock.api.model.MultiAcntModel
import com.ktyoung.chickenstock.retrofit.RetrofitManager
import com.ktyoung.chickenstock.retrofit.RetrofitService
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import org.xmlpull.v1.XmlPullParserFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


class MultiAcntRepository(
        val acntList: MutableLiveData<ArrayList<MultiAcntModel>>,
        val corpList: MutableLiveData<ArrayList<CorpModel>>,
        val error: MutableLiveData<String>
) {
    var retrofit: RetrofitManager
    var arr = ArrayList<CorpModel>()

    companion object{
        fun newInstance(
                acntList: MutableLiveData<ArrayList<MultiAcntModel>>,
                corpList: MutableLiveData<ArrayList<CorpModel>>,
                error: MutableLiveData<String>
        ) = MultiAcntRepository(acntList, corpList, error)
    }

    init {
        Log.d(this.javaClass.name, "MultiAcntRepository init step")
        retrofit = RetrofitService.getInstance(1)
    }

    fun getMultiAcntList(crtfc_key: String, corp_code: String, bsns_year: String, reprt_code: String, fs_div: String) {
        retrofit.getMultiAcnt(crtfc_key, corp_code, bsns_year, reprt_code).enqueue(object : Callback<MultiAcntApiModel> {
            override fun onResponse(
                    call: Call<MultiAcntApiModel>,
                    response: Response<MultiAcntApiModel>
            ) {
                val model = response.body()?.list
                if (model != null) {
                    if (model.size < 27) {
                        error.postValue("해당 년도 데이터가 존재하지않습니다.")
                        return
                    }

                    // model sort 후, 재조합
                    model.sortWith(Comparator { data1, data2 -> data1.ord.compareTo(data2.ord)})
                    model.sortBy { data -> data.ord }

                    val list = arrayListOf<MultiAcntModel>()
                    val corpList = corp_code.split(",")

                    if(corpList[0].equals(model[0].corp_code)) {
                        for (index in model.indices) {
                            if(model[index].fs_div.equals(fs_div))
                                if(index % 2 == 0) {// 짝수
                                    list.add(model[index])
                                } else {// 홀수
                                    list.get(list.size - 1).thstrm_amount2 = model.get(index).thstrm_amount
                                }
                        }
                    } else {
                        for (index in model.indices) {
                            if(model[index].fs_div.equals(fs_div))
                                if(index % 2 == 0) {// 짝수
                                    list.add(model[index + 1])
                                } else {// 홀수
                                    list.get(list.size - 1).thstrm_amount2 = model.get(index - 1).thstrm_amount
                                }
                        }
                    }

                    acntList.postValue(list)

                    Log.d(this.javaClass.name, "MultiAcntRepository get MultiAcntList success")
                } else {
                    error.setValue(response.body()?.message)
                }
            }

            override fun onFailure(call: Call<MultiAcntApiModel>, t: Throwable) {
                Log.d(this.javaClass.name, "MultiAcntRepository get NewsList failed")
                error.setValue(t.stackTrace.toString())
            }

        })
    }

    fun getCorp(resources: Resources) {
        // 내부 xml파일이용시
        val am = resources.assets
        val inputStream: InputStream? = am.open("CORPCODE.xml")
        val inputStreamReader = InputStreamReader(inputStream)
        val reader = BufferedReader(inputStreamReader)
        var factory: XmlPullParserFactory? = null
        var xmlParser: XmlPullParser? = null
        try {
            factory = XmlPullParserFactory.newInstance()
            xmlParser = factory.newPullParser()
            xmlParser.setInput(reader)
            var eventType = xmlParser.eventType

            var name = ""
            var corpCode = ""
            var corpName = ""
            while (eventType != XmlPullParser.END_DOCUMENT) {
                when (eventType) {
                    XmlPullParser.START_TAG -> {
                        name = xmlParser.name
                    }
                    XmlPullParser.TEXT ->{
                        if (!xmlParser.text.equals("\n        ")) {
                            if (name.equals("corp_code")) {
//                                Log.i("TAG", "TEXT : " + xmlParser.text)
                                corpCode = xmlParser.text
                            } else if (name.equals("corp_name")) {
//                                Log.i("TAG", "TEXT : " + xmlParser.text)
                                corpName = xmlParser.text
                                arr.add(CorpModel(corpCode,corpName))
                            }
                        }
                    }
                }
                try {
                    eventType = xmlParser.next()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        } catch (e: XmlPullParserException) {
            e.printStackTrace()
        } finally {
            try {
                if (reader != null) reader.close()
                if (inputStreamReader != null) inputStreamReader.close()
                if (inputStream != null) inputStream.close()
            } catch (e2: Exception) {
                e2.printStackTrace()
            }
        }

        corpList.postValue(arr)
    }
}