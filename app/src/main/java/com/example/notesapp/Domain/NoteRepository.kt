package com.example.notesapp.Domain

interface NoteRepository {

    suspend fun getNotes(): List<Note>
    suspend fun addNote(note: Note)
    suspend fun updateNote(note: Note)
    suspend fun deleteNote(note: Note)
}