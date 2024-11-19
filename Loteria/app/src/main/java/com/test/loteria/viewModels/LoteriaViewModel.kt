package com.test.loteria.viewModels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State


class LoteriaViewModel: ViewModel() {
    private  val _lottoNumbers = mutableStateOf(emptyList<Int>())
    val lottoNumbers: State<List<Int>> = _lottoNumbers

    fun generateLottoNumbers() {
        _lottoNumbers.value = (1..60).shuffled().take(n = 6).sorted()
    }
}