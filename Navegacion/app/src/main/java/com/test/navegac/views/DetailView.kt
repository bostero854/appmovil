package com.test.navegac.views

import android.R
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.test.navegac.components.MainButton
import com.test.navegac.components.MainIconButton
import com.test.navegac.components.Space
import com.test.navegac.components.TiTleBar
import com.test.navegac.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailView(navController: NavController, id:Int, opcional: String?){
    Scaffold(
        topBar = {
            TopAppBar(
                        title =  {TiTleBar(name = "Detail view")} ,
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = { MainIconButton(icon= Icons.Default.ArrowBack){
                    navController.popBackStack()
                } }
            )
        }
    ) {
        ContentDetaillView(navController, id,opcional)
    }
}
@Composable
fun ContentDetaillView(navController: NavController, id:Int, opcional: String?){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        TitleView("Home View")
        Space()
        TitleView(id.toString())
        Space()

        if (opcional == ""){
            Spacer(modifier = Modifier.height(0.dp))
        }else{
            TitleView(name = opcional.orEmpty())
        }

        MainButton(name = "Return Home", backColor = Color.Blue, color = Color.White) {
            println("Soy un pix")

            navController.popBackStack()
        }
    }
}