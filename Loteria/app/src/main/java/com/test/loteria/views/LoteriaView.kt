package com.test.loteria.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.loteria.viewModels.LoteriaViewModel
import androidx.compose.foundation.lazy.items


@Composable
fun LoteriaView(viewModel: LoteriaViewModel){
    val lottoNumbers = viewModel.lottoNumbers.value

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        if(lottoNumbers.isEmpty()){
            Text(text="Loteria", fontSize = 40.sp,
                fontWeight = FontWeight.Bold)
        }else{
            LotteryNumbers(numbers = lottoNumbers)
        }
        Button(onClick = {
            viewModel.generateLottoNumbers()
        }) {
            Text(text="Generar", fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun LotteryNumbers(numbers: List<Int>) {
    LazyRow(
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 8.dp
        )
    ) {
        items(numbers) { number -> // Cambié "numbers" por "number" en singular
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .size(48.dp)
                    .background(Color.Red, CircleShape)
            ) {
                Text(
                    text = number.toString(), // Convertimos cada número a texto
                    color = Color.White,
                    fontSize = 24.sp
                )
            }
        }
    }
}
