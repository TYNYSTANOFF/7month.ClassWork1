package com.example.a7monthclasswork1.domain.usecase

import com.example.a7monthclasswork1.domain.model.Note
import com.example.a7monthclasswork1.domain.repository.NoteRepository

class EditNoteUseCase(
    private val noteRepository: NoteRepository
    ) {

    fun editNote(note:Note) = noteRepository.editNote(note)

}