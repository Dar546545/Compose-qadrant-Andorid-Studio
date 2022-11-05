package com.example.qadrantcomp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qadrantcomp.ui.theme.QadrantcompTheme
import kotlinx.coroutines.channels.ticker

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QadrantcompTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleText()
                }
            }
        }
    }
}

//Using xml for text
@Composable
fun ArticleText(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            // green and yellow background
            ImageCard(
                title = stringResource(R.string.Title1),
                descreption = stringResource(R.string.Text1),
                BackgroundColor =Color.Green,
                modifier =Modifier.weight(1f)
            )
            ImageCard(
                title = stringResource(R.string.Title2),
                descreption = stringResource(R.string.Text2),
                BackgroundColor =Color.Yellow,
                modifier =Modifier.weight(1f)
            )
        }


        //Another Box with blue and gray background
        Row(Modifier.weight(1f)) {
            ImageCard(
                title = stringResource(R.string.Title3),
                descreption = stringResource(R.string.Text3),
                BackgroundColor =Color.Cyan,
                modifier =Modifier.weight(1f)
            )
            ImageCard(
                title = stringResource(R.string.Title4),
                descreption = stringResource(R.string.Text4),
                BackgroundColor =Color.Gray,
                modifier =Modifier.weight(1f)
            )
        }
    }
}


//Text padding, centralizing text
@Composable
fun ImageCard(
    title: String,
    descreption: String,
    BackgroundColor: Color,
    modifier: Modifier = Modifier
)   {
     Column(
         modifier = modifier
         .fillMaxSize()
         .background(BackgroundColor)
         .padding(16.dp),
         horizontalAlignment =Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
     ){
         Text(
             text = title,
             fontWeight = FontWeight.Bold,
             modifier = Modifier.padding(bottom = 16.dp)
         )
         Text(
             text = descreption,
             textAlign = TextAlign.Justify
         )
     }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QadrantcompTheme {
        ArticleText()
    }
}