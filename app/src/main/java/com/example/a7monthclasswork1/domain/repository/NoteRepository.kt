package com.example.a7monthclasswork1.domain.repository

import com.example.a7monthclasswork1.data.localdb.NoteDao
import com.example.a7monthclasswork1.domain.model.Note

interface NoteRepository {

//Репозитори в Домейн должен быть пустым, так как реализация происходит в Дата

    fun createNote(note : Note)
    fun getAllNotes():List<Note>
    fun editNote (note : Note)
    fun deleteNote(note : Note)

}