package com.example.roomdb.activities

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.roomdb.R
import com.example.roomdb.databinding.ActivityAddBinding
import com.example.roomdb.helper.*
import com.example.roomdb.model.ToDoList
import com.example.roomdb.singleton.RingAlarm
import com.example.roomdb.singleton.SingletonHelper
import com.example.roomdb.viewModel.UpdateActivityVM
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UpdateActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityAddBinding
    lateinit var priority: String
    var alarmHour: Int = 0
    var alarmMinute = ""
    var alarmTime: String? = null
    var isAlarmset = 0

    @Inject
    lateinit var singletonHelper: SingletonHelper

    @Inject
    lateinit var ringAlarm: RingAlarm

    lateinit var itemBundle: ToDoList

    val viewModel: UpdateActivityVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        itemBundle = intent.getParcelableExtra<ToDoList>(Constants.KEY_ITEM)!!
        binding.constraintLayoutUpdate.visible()
        alarmHour = itemBundle.taskHour
        alarmMinute = itemBundle.taskMinute.toString()
        setData()
        onCLicked()


    }

    private fun priorityBtnChecked(priority: String) {
        when (priority) {
            "High" -> binding.btnHighUpdate.isChecked = true
            "Medium" -> binding.btnMediumUpdate.isChecked = true
            else -> binding.btnLowUpdate.isChecked = true
        }
    }

    private fun priorityConvertToString(id: Int) {
        when (id) {
            R.id.btnHighUpdate -> priority = "High"
            R.id.btnMediumUpdate -> priority = "Medium"
            else -> priority = "Low"
        }
    }

    @SuppressLint("ResourceAsColor")
    fun setData() {
        binding.tvTaskUpdate.setText(itemBundle.taskTitle)
        binding.tvDescUpdate.setText(itemBundle.taskDescription)
        if (itemBundle.isAlarmSet == 1) {
            isAlarmset = 1
            binding.tvTimeUpdate.setTextView(
                "${itemBundle.taskHour}:${itemBundle.taskMinute} ${
                    singletonHelper.isTimeAMOrPM(
                        itemBundle.taskHour
                    )
                }"
            )
        } else {
            isAlarmset = 0
            binding.tvTimeUpdate.setTextView("Alarm  is not set")
            binding.tvTimeUpdate.setTextColor(R.color.grey)
        }

        itemBundle.priority.let { priorityBtnChecked(it) }
    }

    private fun updateData() {
        var task = binding.tvTaskUpdate.getText().toString()
        var description = binding.tvDescUpdate.getText().toString()
        priority = itemBundle.priority.toString()
        priorityConvertToString(binding.rdbtnPriorityUpdate.checkedRadioButtonId)
        if (task != itemBundle.taskTitle || description != itemBundle.taskDescription || itemBundle.priority != priority || alarmHour != itemBundle.taskHour || alarmMinute != itemBundle.taskMinute.toString()) {
            itemBundle.id.let { it1 ->
                if (priority != null) {
                    viewModel.updateById(
                        task,
                        description,
                        priority,
                        itemBundle.id,
                        alarmHour,
                        alarmMinute.toInt(),
                        isAlarmset
                    )
                }
            }
            if (alarmHour != itemBundle.taskHour || alarmMinute != itemBundle.taskMinute.toString() || singletonHelper.isTimeAMOrPM(
                    alarmHour
                ) != singletonHelper.isTimeAMOrPM(itemBundle.taskHour)
            ) {
                ringAlarm.setAlarm(
                    ToDoList(
                        task,
                        description, priority, alarmHour, alarmMinute.toInt(), isAlarmset
                    ), Action.UPDATE
                )
            }
        }



        finish()
    }

    fun onCLicked() {
        binding.btnUpdate.setOnClickListener(this)
        binding.btnDelete.setOnClickListener(this)
        binding.tvTimeUpdate.setOnClickListener(this)
        binding.btnOk.setOnClickListener(this)
    }


    @SuppressLint("ResourceAsColor")
    override fun onClick(view: View?) {
        when (view) {
            binding.btnUpdate -> {
                updateData()
            }
            binding.btnDelete -> {
                itemBundle?.id?.let { it1 -> viewModel.deleteById(it1) }
                ringAlarm.setAlarm(itemBundle, Action.DELETE)
                finish()
            }
            binding.tvTimeUpdate -> {
                binding.timePicker.visible()
            }
            binding.btnCancel -> {
                binding.timePicker.hide()
            }
            binding.btnOk -> {
                if (itemBundle.isAlarmSet == 0) {
                    isAlarmset = 1
                    binding.tvTimeUpdate.setTextColor(R.color.black)
                }
                getTime()
                binding.timePicker.hide()

            }

        }
    }

    private fun getTime() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmHour = binding.timePicker.hour
            alarmMinute = singletonHelper.changeMinuteFormat(binding.timePicker.minute)
            alarmTime =
                "${singletonHelper.changeHourFormat(binding.timePicker.hour)}:$alarmMinute ${
                    singletonHelper.isTimeAMOrPM(binding.timePicker.hour)
                }"
            binding.tvTimeUpdate.setTextView("$alarmTime")


        }
    }
}