package com.example.roomdb.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdb.model.ToDoList
import com.example.roomdb.repository.ToDoListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddActivityVM @Inject constructor(var repository: ToDoListRepository) : ViewModel() {

    fun insert(toDoList: ToDoList) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(toDoList)

        }
    }

}