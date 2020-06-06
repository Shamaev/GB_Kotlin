package com.geekbrains.notelist_v01.mvvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geekbrains.notelist_v01.R
import com.geekbrains.notelist_v01.data.entity.Note
import kotlinx.android.synthetic.main.item_list.view.*

class NoteRVAdapter : RecyclerView.Adapter<NoteRVAdapter.ViewHolder>() {

    var notes: List<Note> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(note: Note) = with(itemView) {
            titleText.text = note.title
            infoText.text = note.text
            setBackgroundColor(note.color)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )

    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(notes[position])
    }
}