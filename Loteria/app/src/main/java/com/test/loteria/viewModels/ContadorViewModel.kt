package com.test.loteria.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContadorViewModel: ViewModel() {
    private val _contador = mutableStateOf(value = 0)
    val contador: State<Int> = _contador
    fun add(){
        _contador.value = _contador.value + 1
    }
    //var contador = mutableStateOf(value = 0)

}