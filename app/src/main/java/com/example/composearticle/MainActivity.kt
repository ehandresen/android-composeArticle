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
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.foundation.layout.Arrangement.Horizontal
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.graphics.vector.ImageVector

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        NameCard()
                        InfoCard(
                            icon = Icons.Default.Call,
                            content = "+47 907 11 942",
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        InfoCard(
                            icon = Icons.Default.Share,
                            content = "@ehandresen",
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        InfoCard(
                            icon = Icons.Default.Email,
                            content = "ei.an@dev.com",
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )}
                }
            }
        }
    }
}

@Composable
fun NameCard(modifier: Modifier = Modifier) {
    val x: String? = null

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(fraction = 0.7f),
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
            color = Color(0xFF3ddc84)            ,
            fontWeight = FontWeight.SemiBold
        )
    }
}


@Composable
fun InfoCard(
    icon: ImageVector,
    content: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 100.dp), // Add padding if needed
        horizontalArrangement = Arrangement.Center, // Center horizontally
        verticalAlignment = Alignment.CenterVertically //
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            //tint = Color(0xFF3ddc84), // Optional: Set the tint color,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = content,
            textAlign = TextAlign.Start,
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            NameCard()
            //Spacer(modifier = Modifier)
            InfoCard(
                icon = Icons.Default.Call,
                content = "+47 907 11 942",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            InfoCard(
                icon = Icons.Default.Share,
                content = "@ehandresen",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            InfoCard(
                icon = Icons.Default.Email,
                content = "ei.an@dev.com",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}
















