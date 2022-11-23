package com.example.a7monthclasswork1.data.localdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.a7monthclasswork1.data.model.NoteEntity

@Dao
interface NoteDao {

//CRUD

@Insert(onConflict = OnConflictStrategy.REPLACE)
fun createNote(noteEntity: NoteEntity)

@Query("SELECT * FROM notes")
fun getAllNote():List<NoteEntity>

@Update
fun editNote(noteEntity: NoteEntity)

@Delete
fun deleteNote(noteEntity: NoteEntity)

}