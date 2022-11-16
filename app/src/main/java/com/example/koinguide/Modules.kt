package com.example.koinguide

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.koinguide.ui_main.Friend
import com.example.koinguide.ui_main.MainViewModel
import com.example.koinguide.ui_main.SchoolCourse
import com.example.koinguide.ui_main.Student
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { SchoolCourse () }

    factory { Friend() }

    factory { Student(get(),get()) }
}

val viewmodelModule = module {
    viewModel { MainViewModel(get(), get()) }
}