package com.example.roomdb.activities

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
import com.example.roomdb.viewModel.AddActivityVM
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class AddActivity() : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityAddBinding
    var isAlarmSet = 0
    var alarmHour: Int = 0
    var alarmMinute: String? = null
    var alarmTime: String? = null


    @Inject
    lateinit var singletonHelper: SingletonHelper

    @Inject
    lateinit var ringAlarm: RingAlarm

    private val viewModel: AddActivityVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.constraintLayoutAdd.visible()
        onCLicked()


    }

    private fun getTime() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmHour = binding.timePicker.hour
            alarmMinute = singletonHelper.changeMinuteFormat(binding.timePicker.minute)
            alarmTime =
                "${singletonHelper.changeHourFormat(binding.timePicker.hour)}:$alarmMinute ${
                    singletonHelper.isTimeAMOrPM(binding.timePicker.hour)
                }"
            binding.tvTimeAdd.setTextView("$alarmTime")


        }
    }

    override fun onClick(view: View?) {
        when (view) {
            binding.btnOk -> {
                isAlarmSet = 1
                binding.timePicker.hide()
                getTime()
            }

            binding.btnCancel -> {
                binding.timePicker.hide()
            }
            binding.btnAdd -> {
                addData()
            }
            binding.tvTimeAdd -> {
                isAlarmSet = 0
                binding.timePicker.visible()
            }
        }
    }

    fun onCLicked() {
        binding.btnOk.setOnClickListener(this)
        binding.btnCancel.setOnClickListener(this)
        binding.btnAdd.setOnClickListener(this)
        binding.tvTimeAdd.setOnClickListener(this)
    }

    private fun addData() {
        val task: String = binding.tvTaskAddUp.getText().toString()
        val description: String = binding.tvDescAddUp.getText().toString()
        var priority: String? = null
        when (binding.rdbtnPriorityAdd.checkedRadioButtonId) {
            R.id.btnHighAdd -> priority = "High"
            R.id.btnMediumAdd -> priority = "Medium"
            R.id.btnLowAdd -> priority = "Low"
            else -> {}
        }
        if (task.isNotEmpty() && description.isNotEmpty() && priority?.isNotEmpty() == true) {
            if (isAlarmSet == 1) {
                ringAlarm.setAlarm(
                    ToDoList(
                        task,
                        description,
                        priority,
                        alarmHour,
                        alarmMinute!!.toInt(),
                        isAlarmSet
                    ), Action.ADD
                )
                viewModel.insert(
                    ToDoList(
                        task,
                        description,
                        priority,
                        alarmHour,
                        alarmMinute!!.toInt(),
                        isAlarmSet
                    )
                )

            } else {
                viewModel.insert(ToDoList(task, description, priority, 0, 0, isAlarmSet))

            }
        } else {
            singletonHelper.showToastLong(this@AddActivity, "Empty String not saved")
        }
        isAlarmSet = 0
        finish()
    }


}