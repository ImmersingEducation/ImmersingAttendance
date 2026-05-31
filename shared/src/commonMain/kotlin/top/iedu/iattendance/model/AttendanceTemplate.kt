package top.iedu.iattendance.model

data class AttendanceTemplate(
    val uuid: String,
    var name: String,
    val needAttendanceStudent: MutableList<Student>
)
