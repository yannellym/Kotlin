package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = androidx.compose.ui.graphics.Color.Gray
                ) {
                    TitleWithName(
                        name = getString(R.string.name),
                        title = getString(R.string.title),
                        logo = painterResource(
                        id= R.drawable.android_logo)
                    )
                    ContactinfoWithIcons(
                        phone = getString(R.string.phone),
                        twitter = getString(R.string.twitter),
                        email = getString(R.string.email),
                        icon = painterResource(
                            R.drawable.android_logo
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun TitleWithName(name: String, title: String, logo: Painter) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    )
    {
        Image(
            painter = logo,
            contentDescription = null,
            modifier = Modifier
                    .size(94.dp)
                .padding(bottom=20.dp)
        )
        Text(
            text = name,
            fontSize = 30.sp,
            color = White,
            modifier = Modifier
                .padding(bottom=20.dp)
        )
        Text(
            text = title,
            fontSize = 14.sp,
            color = Green,
        )
    }
}
@Composable
fun ContactinfoWithIcons(phone: String, twitter: String, email:String, icon: Painter) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 500.dp, start = 40.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,

        )
    {
        Row {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = phone,
                fontSize = 15.sp,
                color = White,
                modifier = Modifier
                    .padding(top=10.dp, start = 10.dp)
            )
        }
        Row {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = twitter,
                fontSize = 15.sp,
                color = White,
                modifier = Modifier
                    .padding(top=10.dp, start = 10.dp)
            )
        }
        Row {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = email,
                fontSize = 15.sp,
                color = White,
                modifier = Modifier
                    .padding(top=10.dp, start = 10.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = androidx.compose.ui.graphics.Color.Gray
        ) {
            TitleWithName(
                name = "Yannelly Mercado",
                title = "Android Developer Extraordinaire",
                logo = painterResource(
                    id = R.drawable.android_logo
                )
            )
            ContactinfoWithIcons(
                phone = "+1 (978) 678 - 6768",
                twitter = "disssbi_",
                email = "yannellym@gmail.com",
                icon = painterResource(
                    id= R.drawable.android_logo
                )
            )
        }
    }
}