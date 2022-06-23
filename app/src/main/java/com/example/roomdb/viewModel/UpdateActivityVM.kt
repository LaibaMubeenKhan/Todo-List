package com.example.roomdb.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdb.repository.ToDoListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UpdateActivityVM @Inject constructor(var repository: ToDoListRepository) : ViewModel() {

    fun updateById(
        taskT: String,
        taskDesc: String,
        taskPriority: String,
        itemId: Long,
        taskHour: Int,
        taskMinute: Int,
        isAlarmSet: Int
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateById(
                taskT,
                taskDesc,
                taskPriority,
                itemId,
                taskHour,
                taskMinute,
                isAlarmSet
            )
        }
    }

    fun deleteById(itemId: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(itemId)
        }
    }
}