package com.test.botones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.botones.ui.theme.BotonesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BotonesTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    Content()
                }
            }
        }
    }
}

@Composable
fun Content(){
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
        DarkMode()
    }
}
@Composable
fun BotonNormal(){
    Button(onClick = { /*TODO*/ }, enabled = false) {
        Text(text = "Mi Boton", fontSize = 30.sp)
        
    }
}
@Composable
fun BotonNormal2(){
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
    containerColor = Color.Red//Color de fondo

    )) {
        Text(text = "Mi Boton", fontSize = 30.sp)

    }
}
@Composable
fun BotonTexto(){
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonOutLine(){
    OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(3.dp, Color.Blue)) {
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonIcono(){
    IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Home, contentDescription = "Icono", tint = Color.Red,
            modifier = Modifier.size(50.dp))
    }
}

@Composable
fun BotonSwitch(){
    var switeched by remember { mutableStateOf(value = false)}
    Switch(checked = switeched, onCheckedChange = {switeched = it},
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Red,
            checkedTrackColor = Color.Green,
            uncheckedThumbColor = Color.Blue,
            uncheckedTrackColor = Color.Magenta
            )
    )
}

@Composable
fun DarkMode(){
    Button(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "DarkMode", tint = Color.Red)
        Spacer(modifier= Modifier.width(5.dp))
        Text(text = "DarkMode", fontSize = 30.sp)
    }
}
@Composable
fun Space(){
    Spacer(modifier = Modifier.height(10.dp))
}
