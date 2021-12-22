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
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
                    val painter = painterResource(R.drawable.img)
                    val contentDescription = "Boruto x Sumire"
                    val title = "Boruto help Sumire"

                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(0.5f)
                                .padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            ImageBox(painter = painter,
                                contentDescription = contentDescription,
                                title = title )
                        }
                    }


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
@Composable
fun ImageBox(
    painter: Painter,
    contentDescription : String,
    title : String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = 6.dp
    ) {
        Box(
            modifier = Modifier.width(200.dp),
        ) {
            Image(painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        )
                    )
                )
            ) {

            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title,
                    style = TextStyle(color = Color.White,
                        fontSize = 16.sp)
                )
            }

        }
    }
}

