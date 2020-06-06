package com.geekbrains.notelist_v01.data

import com.geekbrains.notelist_v01.data.entity.Note

object NotesRepository {
    private val notes: List<Note> = listOf(
        Note(
            "Заголовок заметки",
            "Короткий текст заметки",
            0xffFFA07A.toInt()
        ),
        Note(
            "Заголовок заметки",
            "Короткий текст заметки",
            0xffFFC0CB.toInt()
        ),
        Note(
            "Заголовок заметки",
            "Короткий текст заметки",
            0xff98FB98.toInt()
        ),
        Note(
            "Заголовок заметки",
            "Короткий текст заметки",
            0xffB0C4DE.toInt()
        ),
        Note(
            "Заголовок заметки",
            "Короткий текст заметки",
            0xffFFDEAD.toInt()
        ),
        Note(
            "Заголовок заметки",
            "Короткий текст заметки",
            0xff7FFFD4.toInt()
        )
    )

    fun getNotes(): List<Note> {
        return notes
    }

}