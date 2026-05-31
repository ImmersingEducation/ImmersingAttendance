package top.iedu.iattendance.model

import kotlinx.datetime.LocalDateTime

data class AttendanceRecord(
    val uuid: String,
    val template: AttendanceTemplate,
    val createTime: LocalDateTime,
    var editTime: LocalDateTime,
    var name: String,
    val situations: MutableMap<Student, AttendanceSituation>,
)
