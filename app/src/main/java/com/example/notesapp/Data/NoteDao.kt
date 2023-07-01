package com.example.notesapp.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    suspend fun getNotes(): List<NoteEntity>

    @Insert
    suspend fun addNote(Note:NoteEntity)

    @Insert
    suspend fun updateNote(Note: NoteEntity)

    @Delete
    suspend fun deleteNote(Note: NoteEntity)

}