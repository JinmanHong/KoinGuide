package com.example.koinguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koinguide.ui_main.MainViewModel
import com.example.koinguide.ui_main.Student
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val viewModel by inject<MainViewModel>()

    val student2 by inject<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = get<Student>()
        student.beSmart()

        student2.beSmart()

        val viewModel = get<MainViewModel>()
        viewModel.performAction()

        doSomething()

    }
    fun doSomething() {
        viewModel.performAction()
    }

}