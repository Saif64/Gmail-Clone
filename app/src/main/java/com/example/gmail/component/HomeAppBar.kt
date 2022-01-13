package com.example.gmail.component

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmail.GmailApp
import com.example.gmail.R
import com.example.gmail.ui.theme.GmailTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {

    Box(
        modifier = Modifier.padding(10.dp)
    ) {
        Card(
            shape = RoundedCornerShape(size = 10.dp),
            elevation = 8.dp,
            modifier = Modifier.requiredHeight(50.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {

                Icon(
                    imageVector = Icons.Default.Menu, contentDescription = null,
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .clickable {
                            scope.launch {
                                scaffoldState.drawerState.open()
                            }
                        }
                )

                Text(
                    text = "Search in Emails",
                    modifier = Modifier.weight(2.0f)
                )
                Image(
                    painter = painterResource(id = R.drawable._567852697544_9cd0010c_9172_4930_baaf_a3561482567c_),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                )
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    GmailTheme {
        GmailApp()
    }
}