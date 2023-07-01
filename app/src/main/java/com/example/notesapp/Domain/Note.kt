package com.example.notesapp.Domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")



data class Note(

    @PrimaryKey(autoGenerate = true)
    val id: String,
    val title: String,
    val content: String,
    val timestamp: Long
)
