package ru.skillbranch.devintensive.models

import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

class Date {
    const val SECOND = 1000L
    const val MINUTE = 60 * SECOND
    const val HOUR = 60 * MINUTE
    const val DAY = 24 * HOUR

    fun Date.format(pattern: String = "HH:mm:ss"): String {
        val dateFormat = SimpleDateFormat(pattern, Locale(language:"ru"))
        return dateFormat.format(date:this)
    }

    fun Date.add(value: Int, units: String): Date {
        var time = this.time
        time+=when(units){

        }
        this.time=time
        return  this
    }
}