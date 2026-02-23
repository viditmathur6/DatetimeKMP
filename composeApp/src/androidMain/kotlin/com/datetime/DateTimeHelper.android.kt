package com.datetime

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

actual class DateTimeHelper actual constructor() {
    actual fun getCurrentDateTime(): String {
        // Android ka native date format
        val formatter = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault())
        return formatter.format(Date())
    }
}