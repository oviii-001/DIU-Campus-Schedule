package com.om.diucampusschedule.models

data class Tasks (
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val time: String,
    val isCompleted: Boolean
)