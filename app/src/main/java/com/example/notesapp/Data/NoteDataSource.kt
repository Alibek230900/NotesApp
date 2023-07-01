package com.example.notesapp.Data

import com.example.notesapp.Domain.Note

interface NoteDataSource {
    suspend fun getNotes(): List<Note>
    suspend fun addNote(note: Note)
    suspend fun updateNote(note: Note)
    suspend fun deleteNote(note: Note)
}