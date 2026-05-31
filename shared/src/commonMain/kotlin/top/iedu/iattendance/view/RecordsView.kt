package top.iedu.iattendance.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.datetime.format
import top.iedu.iattendance.model.AttendanceRecord

@Composable
fun RecordItem(record: AttendanceRecord) {
    Button(modifier = Modifier.fillMaxWidth(), onClick = { }) {
        Row {
            Column {
                Row {
                    Text(record.name.ifBlank { record.template.name })
                }
                Text("创建于 ...")
                Text("修改于 ...")
            }
            Column {
                Text("应到 ... 人")
                Text("实到 ... 人")
                Text("请假 ... 人")
            }
        }
    }
}

@Composable
fun RecordsView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(modifier = Modifier.align(Alignment.End), onClick = { }) {
            Text("筛选")
        }
    }
}