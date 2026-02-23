package com.datetime

import platform.Foundation.NSDate
import platform.Foundation.NSDateFormatter

actual class DateTimeHelper actual constructor() {
    actual fun getCurrentDateTime(): String {
        // iOS ka native date format
        val formatter = NSDateFormatter()
        formatter.dateFormat = "dd-MM-yyyy HH:mm:ss"
        return formatter.stringFromDate(NSDate())
    }
}