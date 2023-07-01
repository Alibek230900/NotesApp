package com.example.notesapp.Domain

class AddNoteUseCase(private val noteRepository: NoteRepository ) {

    suspend operator fun invoke(note: Note){
        noteRepository.addNote(note)
    }

}