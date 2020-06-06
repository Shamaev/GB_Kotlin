package com.geekbrains.notelist_v01.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geekbrains.notelist_v01.data.NotesRepository

class MainViewModel: ViewModel() {
    private val stateLiveData: MutableLiveData<MainViewState> = MutableLiveData()

    init {
        stateLiveData.value = MainViewState(NotesRepository.getNotes())
    }

    fun getState(): LiveData<MainViewState> = stateLiveData
}