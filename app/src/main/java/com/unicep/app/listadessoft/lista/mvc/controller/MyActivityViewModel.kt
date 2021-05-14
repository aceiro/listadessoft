package com.unicep.app.listadessoft.lista.mvc.controller

import android.util.Log
import androidx.lifecycle.ViewModel
import com.unicep.app.listadessoft.lista.mvc.model.UserModel

class MyActivityViewModel : ViewModel() {
    private val _featureFlag: Boolean = true
    private  fun loadUsersFromMockData() {
        Log.e("_MyActivityViewModel", "Loading users from remote API")
        for (i in listOf(
            UserModel("Rui", 1),
            UserModel("Bia", 2),
            UserModel("Eva", 3)
        )) {
            Log.e("_loadUsers.", "${i.userId} -- ${i.userName}")
        }
    }

    private fun loadUsersFromApi() {
        throw UnsupportedOperationException("loadUsersFromApi is not available!")
    }

    fun loadUserData(){
        if(_featureFlag)
            loadUsersFromApi()
        else
            loadUsersFromMockData()
    }
}