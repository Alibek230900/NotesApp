package com.example.notesapp.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [NoteEntity::class], version = 1)

abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDao

    companion object{
        @Volatile

        private var INSTANCE: NoteDatabase? = null

        fun getDatabase(context: Context): NoteDatabase{
            return INSTANCE ?: synchronized(this){

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDatabase::class.java,
                    "notes_database"
                ).build()
                INSTANCE = instance
                instance
            }


            /*
            val database = NoteDatabase.getDatabase(context)
            val noteDao = database.noteDao()
            */


        }
    }

}