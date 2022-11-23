package com.example.a7monthclasswork1.domain.usecase

import com.example.a7monthclasswork1.domain.model.Note
import com.example.a7monthclasswork1.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
    ) {

    fun deleteNote(note:Note) = noteRepository.deleteNote(note)

}