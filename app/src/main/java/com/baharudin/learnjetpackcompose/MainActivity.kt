package com.baharudin.learnjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baharudin.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetpackComposeTheme {
                Column {
                    HeaderApp()
                }
            }
        }
    }
}

@Composable
fun HeaderApp() {
    Box(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Column {
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(1f)
                    .height(30.dp)
            ) {
                Image(painter = painterResource(R.drawable.ic_messege)
                    , contentDescription ="Messege" )
                Spacer(modifier = Modifier.size(15.dp))
                Image(painter = painterResource(R.drawable.ic_setting)
                    , contentDescription ="Messege" )
            }
            Row(
                Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription ="Avater",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .border(2.dp, Color.Gray, CircleShape)
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text("Kiiroe Senkuo",
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.size(100.dp))
                Row(horizontalArrangement = Arrangement.End) {
                    Surface(
                        color = Color.Green,
                        border = BorderStroke(1.dp, MaterialTheme.colors.primary),
                        shape = RoundedCornerShape(10.dp),
                        elevation = 10.dp
                    ) {
                        Text("Premium",
                            color = Color.Black,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }

            }
        }
    }

}

