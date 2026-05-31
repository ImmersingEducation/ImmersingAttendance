package top.iedu.iattendance.model

enum class AttendanceSituation {
    Arrived, // 已到
    NonArrival, // 未到
    NoRequirements, // 无需参与
    Late, // 迟到
    Leaved // 请假
}