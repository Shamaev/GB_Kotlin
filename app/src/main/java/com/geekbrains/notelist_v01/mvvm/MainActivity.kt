package com.geekbrains.notelist_v01.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.geekbrains.notelist_v01.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var adapter: NoteRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        recyclerNote.layoutManager = GridLayoutManager(this, 2)
        adapter = NoteRVAdapter()
        recyclerNote.adapter = adapter

        viewModel.getState().observe(this, Observer { state ->
            state?.let { state ->
                adapter.notes = state.notes
            }
        })
    }
}
