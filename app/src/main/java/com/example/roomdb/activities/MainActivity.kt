package com.example.roomdb.activities

import RecyclerAdapter
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.roomdb.databinding.ActivityMainBinding
import com.example.roomdb.helper.Constants
import com.example.roomdb.interfaces.ItemClicked
import com.example.roomdb.model.ToDoList
import com.example.roomdb.singleton.RingAlarm
import com.example.roomdb.singleton.SingletonHelper
import com.example.roomdb.viewModel.MainActivityVM
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity(), ItemClicked {
    lateinit var binding: ActivityMainBinding
    val viewModel: MainActivityVM by viewModels()

    @Inject
    lateinit var singletonHelper: SingletonHelper

    @Inject
    lateinit var ringAlarm: RingAlarm


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.floatAddBtn.setColorFilter(Color.WHITE)
        binding.floatDeleteBtn.setColorFilter(Color.WHITE)


        viewModel.getToDoList.observe(this, Observer {
            it
            binding.recyclerView.adapter = RecyclerAdapter(it, this, this)

        })
        binding.floatAddBtn.setOnClickListener {

            singletonHelper.startNextActivity(AddActivity()::class.java)
        }
        binding.floatDeleteBtn.setOnClickListener {
            viewModel.deleteAll()
        }

    }

    override fun clicked(toDoList: ToDoList) {
        var intent = Intent(this, UpdateActivity::class.java)
        intent.putExtra(Constants.KEY_ITEM, toDoList)
        startActivity(intent)

    }

    override fun onBackPressed() {
        finish()
    }


}