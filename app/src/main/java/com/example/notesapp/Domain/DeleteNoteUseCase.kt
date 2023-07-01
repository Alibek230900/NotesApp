package com.example.notesapp.Domain

class DeleteNoteUseCase (private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        noteRepository.deleteNote(note)
    }
}