package top.iedu.iattendance.extension

import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.minus
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.until
import kotlin.time.Clock

fun LocalDateTime.beautifullyFormat(): String {
    val current = Clock.System.now()
        .toLocalDateTime(TimeZone.currentSystemDefault())

    if (this > current) {
        return "???"
    }

    val timePart = "${this.hour.toString().padStart(2, '0')}:${this.minute.toString().padStart(2, '0')}"

    val thisDate = this.date
    val currentDate = current.date

    if (thisDate == currentDate) {
        return "今天 $timePart"
    }

    val yesterday = currentDate.minus(1, DateTimeUnit.DAY)
    if (thisDate == yesterday) {
        return "昨天 $timePart"
    }

    if (thisDate.year == currentDate.year) {
        return "${thisDate.monthNumber}月${thisDate.dayOfMonth}日"
    }

    return "${thisDate.year}年${thisDate.monthNumber}月${thisDate.dayOfMonth}日"
}