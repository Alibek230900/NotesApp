package com.example.notesapp.Data

import com.example.notesapp.Domain.Note
import com.example.notesapp.Domain.NoteRepository

class NoteRepositoryImpl (private val noteDataSource: NoteDataSource) : NoteRepository {
    override suspend fun getNotes(): List<Note> {
        return noteDataSource.getNotes()
    }

    override suspend fun addNote(note: Note) {
        return noteDataSource.updateNote(note)
    }

    override suspend fun updateNote(note: Note) {
        return noteDataSource.addNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return noteDataSource.deleteNote(note)
    }


}