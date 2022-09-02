package com.example.dota.util.extentions

fun List<String>.separateRoles(): String {
    val separator = "-"
    return joinToString(separator)
}