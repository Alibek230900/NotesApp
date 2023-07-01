package com.example.notesapp.Domain

class UpdateNoteUseCase (private val noteRepository: NoteRepository){
    suspend operator fun invoke(note: Note) {
        noteRepository.updateNote(note)
    }
}