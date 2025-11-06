package com.example.navigation.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenis:List<R.string> =listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> unit
){
    Scaffold (modifier= Modifier,
        topBar = {
            TopAppBar(

            )
        })
}