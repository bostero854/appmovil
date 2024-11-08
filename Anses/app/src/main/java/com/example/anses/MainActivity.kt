package com.example.anses
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.anses.ui.theme.AnsesTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnsesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var clave = ""
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(vertical = 10.dp)
    ) {
        Text(text = "Hola guapo $name!",
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom =  10.dp)
            )
        Row(
                modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(1F))
            Text(text = "Ingresar a tu cuenta", fontSize = 12.sp)
            Spacer(modifier = Modifier.weight(1F))
            Text(text = "Cambiar usuario", fontSize = 12.sp, maxLines = 1)
            Spacer(modifier = Modifier.weight(1F))
        }
        TextField(
            value = clave,
            onValueChange = {},
            modifier = Modifier
                .padding(vertical = 10.dp)
                //.width(200.dp)
                //.align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        )
        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = { /*TODO*/ }) {
            Text(text = "Ingresar")
        }
        //Ver minuto 1:51
        Spacer(modifier = Modifier.weight(1f))
        Text(modifier = Modifier
            .align(Alignment.CenterHorizontally),
            //.padding(vertical = 40.dp),
            text = "Olvide mi clave",
            fontSize = 12.sp)
        Divider()
        Spacer(modifier = Modifier.weight(1f))
        Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "O usa tu huella digital",
                fontSize = 16.sp)
        Spacer(modifier = Modifier.weight(1f))
        IconButton(
            modifier = Modifier.align(Alignment.CenterHorizontally) ,
            onClick = { /*TODO*/ }) {
            Icon(imageVector =  Icons.Filled.Face, contentDescription ="" )
        }
        Spacer(modifier = Modifier.weight(3f))
    }

}



@Preview(showBackground = true, widthDp = 300, heightDp = 600)
@Composable
fun GreetingPreview() {
    AnsesTheme {
        Greeting("Android")
    }
}

