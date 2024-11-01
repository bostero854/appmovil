package com.example.anses
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.anses.ui.theme.AnsesTheme


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
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hola guapo $name!")
        Row() {
            Text(text = "Ingresar a tu cuenta")
            Text(text = "Cambiar usuario")
        }
        TextField(value = clave, onValueChange = {})
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Ingresar")
        }

        Text(text = "Olvide mi clave")
        Divider()
        Text(text = "O usa tu huella digital")
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector =  Icons.Default.Face, contentDescription ="" )
        }
    }

}



@Preview(showBackground = true, widthDp = 300, heightDp = 600)
@Composable
fun GreetingPreview() {
    AnsesTheme {
        Greeting("Android")
    }
}

