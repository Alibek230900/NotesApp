package com.example.notesapp.Presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notesapp.Domain.Note
import com.example.notesapp.Domain.NoteRepository
import kotlinx.coroutines.launch

class NoteListViewModel (private val noteRepository: NoteRepository): ViewModel() {

    private val noteslist = MutableLiveData<List<Note>>()

    val notes: LiveData<List<Note>> = noteslist

    fun loadNotes(){
        viewModelScope.launch{
            val notes = noteRepository.getNotes()
            noteslist.value =  notes

        }
    }
}