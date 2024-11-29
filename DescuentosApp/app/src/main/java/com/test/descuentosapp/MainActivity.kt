package com.test.descuentosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.test.descuentosapp.ui.theme.DescuentosAppTheme
import com.test.descuentosapp.view.HomeView
import com.test.descuentosapp.view.HomeView3
import com.test.descuentosapp.viewModels.CalcularViewModel1
import com.test.descuentosapp.viewModels.CalcularViewModel3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel : CalcularViewModel3 by viewModels()

        setContent {
            DescuentosAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //HomeView(viewModel)
                    HomeView3(viewModel)
                }
            }
        }
    }
}

