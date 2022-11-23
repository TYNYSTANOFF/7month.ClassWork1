package com.example.a7monthclasswork1.data.repository

import com.example.a7monthclasswork1.data.localdb.NoteDao
import com.example.a7monthclasswork1.data.mapper.toEntity
import com.example.a7monthclasswork1.data.mapper.toNote
import com.example.a7monthclasswork1.data.model.NoteEntity
import com.example.a7monthclasswork1.domain.model.Note
import com.example.a7monthclasswork1.domain.repository.NoteRepository

class NoteRepositoryImpl (
    private val noteDao: NoteDao
        ): NoteRepository{

    //Дата из домейна МОЖЕТ брать что либо


    override fun createNote(note: Note) {
noteDao.createNote(note.toEntity())
    }

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNote().map { it.toNote() }
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toEntity())

    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())

    }

}