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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                    Column {
                        Row {
                            TextComposable()
                            ImageComposable()
                        }
                        Row {
                            RowComposable()
                            ColumnComposable()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TextComposable(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize(0.5F)
        .background(Color(0xFFEADDFF))
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Text composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = "Displays text and follows the recommended Material Design guidelines.",
            textAlign = TextAlign.Justify

        )
    }
}

@Composable
fun ImageComposable(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxHeight(0.5F)
        .background(Color(0xFFD0BCFF))
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Image composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = "Creates a composable that lays out and draws a given Painter class object.",
            textAlign = TextAlign.Justify

        )
    }
}

@Composable
fun RowComposable(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxHeight(1.0F)
        .fillMaxWidth(0.5F)
        .background(Color(0xFFB69DF8))
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Row composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = "A layout composable that places its children in a horizontal sequence.",
            textAlign = TextAlign.Justify

        )
    }
}

@Composable
fun ColumnComposable(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF6EDFF))
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Column composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = "A layout composable that places its children in a vertical sequence.",
            textAlign = TextAlign.Justify

        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        Column {
            Row {
                TextComposable()
                ImageComposable()
            }
            Row {
                RowComposable()
                ColumnComposable()
            }
        }
    }
}
















