package com.example.incrementbutton1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            var increment_number = 0
            button_increment.setOnClickListener{

                increment_number++

                increment_textview.text = increment_number.toString()


            }
    }
}