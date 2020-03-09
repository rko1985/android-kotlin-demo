package com.myappcompany.russell.kotlinfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    fun add(view: View){
        count++
        countTextView.text = count.toString()

    }

    fun reset(view: View){
        count = 0
        countTextView.text = count.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countTextView = findViewById<TextView>(R.id.countTextView)
        countTextView.text = "0"


    }
}
