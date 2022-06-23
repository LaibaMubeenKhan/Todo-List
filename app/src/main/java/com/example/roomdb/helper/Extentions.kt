package com.example.roomdb.helper

import android.R
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


fun View.hide() {
    this.visibility = View.GONE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.inVisible() {
    this.visibility = View.INVISIBLE
}

fun TextView.setTextView(text: String?) {
    try {
        if (text.isNullOrBlank()) {
            this.text = ""
        } else {
            this.text = text
        }
    } catch (ex: Exception) {

    }
}
