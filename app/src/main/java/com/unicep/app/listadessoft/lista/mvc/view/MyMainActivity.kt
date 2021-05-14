package com.unicep.app.listadessoft.lista.mvc.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.unicep.app.listadessoft.R
import com.unicep.app.listadessoft.lista.mvc.controller.MyActivityViewModel

class MyMainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_main_activity)

        // val viewModel: MyActivityViewModel = MyActivityViewModel()
        val viewModel: MyActivityViewModel by viewModels()

        // calling viewModel
        viewModel.loadUserData()
    }
}