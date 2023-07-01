package com.example.notesapp.Domain

class GetNotesUseCase(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(): List<Note> {
        return noteRepository.getNotes()
    }
}