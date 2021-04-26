package com.ktyoung.chickenstock.view

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.database.KeywordDatabase
import com.ktyoung.chickenstock.util.EmailUtils
import com.ktyoung.chickenstock.util.SettingDialog
import com.ktyoung.chickenstock.viewmodel.HomeRepository

class SettingFragment : PreferenceFragmentCompat() {
    private var emailUtils = EmailUtils()

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings_preference, rootKey)
//        findPreference<Preference>("help")?.setOnPreferenceClickListener {
//            findNavController().navigate(R.id.action_settingFragment_to_helpFragment) == Unit
//        }
        findPreference<Preference>("email")?.setOnPreferenceClickListener {
            emailUtils.sendEmailToAdmin(requireContext(), "개발자에게 메일보내기", arrayOf("admin@hello.bryan")) == Unit
        }
        findPreference<Preference>("reset")?.setOnPreferenceClickListener {
            val dao = KeywordDatabase.getInstance(requireView().context).keywordDao()
            val repository = HomeRepository.newInstance(dao)
            val dialog =
                SettingDialog.getInstance(yesClick = {
                    if (it) repository.keywordAllDelete()
                }, question = "정말 초기화 하시겠습니까?")
            dialog.show(requireFragmentManager(), dialog.tag) == Unit
        }
    }
}