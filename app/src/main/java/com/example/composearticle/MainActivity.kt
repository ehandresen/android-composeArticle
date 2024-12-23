package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposeArticleTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NameCard()
                }
            }
        }
    }
}

@Composable
fun NameCard(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFF00008B))


        )
        Text(
            text = "Eirik Horgen Andresen",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier
                .padding(vertical = 8.dp)
        )
        Text(
            text = "Frontend Developer",
            color = Color.Magenta
        )
    }
}



//@Composable
//fun ImageComposable(modifier: Modifier = Modifier) {
//    Column(modifier = Modifier
//        .fillMaxHeight(0.5F)
//        .background(Color(0xFFD0BCFF))
//        .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Text(
//            text = "Image composable",
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier
//                .padding(bottom = 16.dp)
//        )
//        Text(
//            text = "Creates a composable that lays out and draws a given Painter class object.",
//            textAlign = TextAlign.Justify
//
//        )
//    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        NameCard()
    }
}
















