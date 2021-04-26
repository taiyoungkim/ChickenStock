package com.ktyoung.chickenstock.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ktyoung.chickenstock.viewmodel.HomeRepository
import com.ktyoung.chickenstock.viewmodel.HomeViewModel

class ViewModelFactory(
        private val homeRepository: HomeRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(homeRepository) as T
    }
}