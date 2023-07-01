package com.example.notesapp.Presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.notesapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var noteListViewModel: NoteListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteListViewModel = ViewModelProvider(this).get(NoteListViewModel::class.java)

        noteListViewModel.notes.observe(this, { notes ->
        })

        noteListViewModel.loadNotes()


    }
}