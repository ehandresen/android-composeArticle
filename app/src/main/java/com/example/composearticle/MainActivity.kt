package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    Column {
                        BannerImage()
                        ArticleText(
                            stringResource(R.string.title),
                            stringResource(R.string.section1),
                            stringResource(R.string.section2)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BannerImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null,
        //contentScale = ContentScale.Crop,
        //alpha = 0.6F
    )
}

@Composable
fun ArticleText(
    title: String,
    section1: String,
    section2: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)
    )
    Text(
        text = section1,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )
    Text(
        text = section2,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        Column {
            BannerImage()
            ArticleText(
                stringResource(R.string.title),
                stringResource(R.string.section1),
                stringResource(R.string.section2)
            )
        }
    }
}