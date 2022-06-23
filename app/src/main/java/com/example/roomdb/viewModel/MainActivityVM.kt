package com.example.roomdb.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.example.roomdb.database.ToDoListRoomDatabase
import com.example.roomdb.model.ToDoList
import com.example.roomdb.repository.ToDoListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityVM @Inject constructor(var repository: ToDoListRepository) : ViewModel() {

    val getToDoList: LiveData<List<ToDoList>> get() = repository.allToDoList

    fun deleteAll() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAll()
        }

    }


}

