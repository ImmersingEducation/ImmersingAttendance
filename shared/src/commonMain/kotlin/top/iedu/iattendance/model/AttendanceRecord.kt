package top.iedu.iattendance.model

import kotlinx.datetime.LocalDateTime

data class AttendanceRecord(
    val uuid: String,
    val template: AttendanceTemplate,
    val createTime: LocalDateTime,
    var editTime: LocalDateTime,
    var name: String,
    val situations: MutableMap<Student, AttendanceSituation>,
) {
    fun peopleNeedAttendanceAmount(): Int {
        return template.needAttendanceStudent.size
    }

    fun peopleActuallyAttendedAmount(): Int {
        var cnt = 0
        situations.forEach { (student, situation) ->
            if (situation == AttendanceSituation.Arrived) cnt ++
        }
        return cnt
    }

    fun peopleActuallyLeavedAmount(): Int {
        var cnt = 0
        situations.forEach { (student, situation) ->
            if (situation == AttendanceSituation.Leaved) cnt ++
        }
        return cnt
    }
}
