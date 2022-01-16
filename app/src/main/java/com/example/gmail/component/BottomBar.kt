package com.example.gmail.component

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.gmail.model.BottomMenuData

@Composable
fun BottomBar() {
    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )

    BottomNavigation(
        elevation = 6.dp,
        backgroundColor = if (isSystemInDarkTheme()) MaterialTheme.colors.background else Color.White,
        contentColor = if (isSystemInDarkTheme()) Color.White else Color.Black
    ) {
        items.forEach {
            BottomNavigationItem(
                label = { Text(text = it.title.toString()) },
                alwaysShowLabel = true,
                selected = false,
                onClick = { },
                icon = { Icon(imageVector = it.icon, contentDescription = null) }
            )
        }
    }
}