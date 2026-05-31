package top.iedu.iattendance

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import top.iedu.iattendance.navigation.AppRoute

import immersingattendance.shared.generated.resources.Res
import immersingattendance.shared.generated.resources.compose_multiplatform
import top.iedu.iattendance.view.HomeView
import top.iedu.iattendance.view.RecordsView

@Composable
@Preview
fun App() {
    val backStack = remember {
        mutableStateListOf<AppRoute>(AppRoute.Home)
    }

    val entryProvider = entryProvider {
        entry<AppRoute.Home> { HomeView() }
        entry<AppRoute.Records> { RecordsView() }
        entry<AppRoute.Settings> { }
        entry<AppRoute.Record> { record -> }
    }

    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NavDisplay(
                backStack = backStack,
                onBack = { backStack.removeLastOrNull() },
                entryProvider = entryProvider,
                modifier = Modifier.weight(1f)
            )
            NavigationBar {
                NavigationBarItem(
                    selected = backStack.lastOrNull() is AppRoute.Home,
                    onClick = { backStack.clear(); backStack.add(AppRoute.Home) },
                    icon = { },
                    label = { Text("首页") }
                )
                NavigationBarItem(
                    selected = backStack.lastOrNull() is AppRoute.Records,
                    onClick = { backStack.clear(); backStack.add(AppRoute.Records) },
                    icon = { },
                    label = { Text("考勤记录") }
                )
            }
        }
    }
}