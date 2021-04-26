package com.ktyoung.chickenstock.retrofit

import android.util.Log
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    init {
        Log.d(this.javaClass.name, "RetrofitService init step")
    }

    companion object {
        private const val BASE_URL_NAVER_API = "https://openapi.naver.com/v1/"
        private const val CLIENT_ID = "N4lTqIh5OZNJiN2Ukf9p"
        private const val CLIENT_SECRET = "Re6qjjx5jF"

        private const val BASE_URL_DART_API = "https://opendart.fss.or.kr/"

        fun getDart() : RetrofitManager {
            var gson = GsonBuilder()
                    .setLenient()
                    .create()

            return Retrofit.Builder().baseUrl(BASE_URL_DART_API)
//                .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
                    .create(RetrofitManager::class.java)
        }

        fun getNaver() : RetrofitManager {
            val headerInterceptor = Interceptor {
                val request = it.request()
                        .newBuilder()
                        .addHeader("X-Naver-Client-Id", CLIENT_ID)
                        .addHeader("X-Naver-Client-Secret", CLIENT_SECRET)
                        .build()
                return@Interceptor it.proceed(request)
            }

            val client = OkHttpClient.Builder()
                    .addInterceptor(headerInterceptor)
                    .build()

            var gson = GsonBuilder()
                    .setDateFormat("E, dd MMMM yyyy HH:mm:ss X")
                    .create()

            return Retrofit.Builder().baseUrl(BASE_URL_NAVER_API)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
                    .create(RetrofitManager::class.java)
        }

        fun getInstance(status: Int): RetrofitManager {
            return if (status == 0)
                getNaver()
            else
                getDart()
        }
    }
}