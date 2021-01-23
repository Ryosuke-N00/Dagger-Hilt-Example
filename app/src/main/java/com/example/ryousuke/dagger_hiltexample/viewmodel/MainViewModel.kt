package com.example.ryousuke.dagger_hiltexample.viewmodel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class MainViewModel @ViewModelInject constructor(
    @Named("TestString2") testString2: String
)
: ViewModel() {

    init {
        Log.d("ViewModel","Test String From ViewModel: $testString2")
    }

}