package top.iedu.iattendance.model

data class Class(
    val uuid: String,
    var name: String,
    val students: MutableList<Student>,
    val templates: MutableList<AttendanceTemplate>,
    val records: MutableList<AttendanceRecord>,
)
