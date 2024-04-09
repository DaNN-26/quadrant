package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    Column (modifier = Modifier.fillMaxWidth()){
        Row (Modifier.weight(1f)) {
                QuadrantInfoCard(
                    messageTitle = stringResource(R.string.first_title),
                    message = stringResource(R.string.first_desc),
                    background = Color(0xFFEADDFF),
                    modifier = Modifier.weight(0.5f)
                )
                QuadrantInfoCard(
                    messageTitle = stringResource(R.string.second_title),
                    message = stringResource(R.string.second_desc),
                    background = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(0.5f)
                )
        }
        Row (Modifier.weight(1f)){
                QuadrantInfoCard(
                    messageTitle = stringResource(R.string.third_title),
                    message = stringResource(R.string.third_desc),
                    background = Color(0xFFB69DF8),
                    modifier = Modifier.weight(0.5f)
                )
                QuadrantInfoCard(
                    messageTitle = stringResource(R.string.fourth_title),
                    message = stringResource(R.string.fourth_desc),
                    background = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(0.5f)
                )
        }
    }
}
@Composable
fun QuadrantInfoCard(messageTitle: String, message: String, background : Color, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(0.dp)
            .background(background)
            .fillMaxSize()) {
        Text(
            text = messageTitle,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 6.dp)
        )
        Text(
            text = message,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}