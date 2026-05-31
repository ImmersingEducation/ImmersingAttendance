package top.iedu.iattendance.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
import top.iedu.iattendance.model.AttendanceRecord

@Serializable
sealed interface AppRoute : NavKey {
    @Serializable
    data object Home : AppRoute

    @Serializable
    data object Records : AppRoute

    @Serializable
    data object Settings : AppRoute

    @Serializable
    data class Record(val record: AttendanceRecord) : AppRoute
}