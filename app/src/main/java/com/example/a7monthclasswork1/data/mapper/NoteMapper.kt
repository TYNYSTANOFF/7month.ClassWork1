package com.example.a7monthclasswork1.data.mapper

import com.example.a7monthclasswork1.data.model.NoteEntity
import com.example.a7monthclasswork1.domain.model.Note

fun Note.toEntity() = NoteEntity(
    id,
    title,
    description,
    createAt
)

fun NoteEntity.toNote() = Note(
    id,
    title,
    description,
    createAt
)