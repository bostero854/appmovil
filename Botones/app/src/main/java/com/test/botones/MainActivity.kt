package com.test.botones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.test.botones.ui.theme.BotonesTheme
import com.test.botones.boton.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val darkMode = remember {mutableStateOf( value = false)}
            BotonesTheme(darkTheme = darkMode.value) {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    Content(darkMode = darkMode)
                }
            }
        }
    }
}

@Composable
fun Content(darkMode: MutableState<Boolean>){
    Column(modifier= Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        BotonNormal();
        Space();
        BotonNormal2();
        Space();
        BotonTexto();
        Space();
        BotonOutLine();
        Space();
        BotonIcono()
        Space();
        BotonSwitch()
        Space();
        DarkMode(darkMode = darkMode)
        Space();
        FloatingAction()
    }
}
