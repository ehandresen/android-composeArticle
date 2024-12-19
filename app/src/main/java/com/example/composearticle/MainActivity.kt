package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    TaskDone(stringResource(R.string.text1), stringResource(R.string.text2))
                }
            }
        }
    }
}

@Composable
fun TaskDone(text1: String, text2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = text2,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        TaskDone(stringResource(R.string.text1), stringResource(R.string.text2))
    }
}
















