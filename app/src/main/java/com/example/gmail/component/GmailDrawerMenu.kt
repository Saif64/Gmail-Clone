package com.example.gmail.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmail.model.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {
    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Setting,
        DrawerMenuData.Help
    )


    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Text(
            text = "Gmail",
            color = if (isSystemInDarkTheme()) Color.White else Color.DarkGray,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        menuList.forEach { item ->
            when {
                item.isDivider -> {
                    Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
                }
                item.isHeader -> {
                    Text(
                        text = item.title!!, fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(start = 20.dp, bottom = 20.dp, top = 20.dp)
                    )
                }
                else -> {
                    MenuDrawerItem(item = item)
                }
            }
        }
    }
}

@Composable
fun MenuDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = null,
            modifier = Modifier.weight(0.5f)

        )
        Text(
            text = item.title.toString(),
            modifier = Modifier.weight(2.0f),
        )
    }
}