package com.factordev.jetpack_compose_tutorial_1

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.factordev.jetpack_compose_tutorial_1.ui.theme.JetpackComposeTutorial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MyImage()
             MyTexts()
            MyComponent()
        }
    }
}

@Composable
fun MyComponent(){
    Row() {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyImage(){
    Image(painterResource(R.drawable.ic_launcher_foreground),
        "mi imagen")
}

@Composable
fun MyTexts(){
    Column(){
        MyText(text = "Hola Jetpack Compose !!!")
        MyText(text = "Preparado ?")
    }

}


@Composable
fun MyText(text: String){
    Text(text)
}

@Preview
@Composable
fun PreviewComponent(){
    MyImage()
    MyComponent()
}

