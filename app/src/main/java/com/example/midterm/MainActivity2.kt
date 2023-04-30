package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private var count = 0

    private lateinit var counter: TextView
    private lateinit var textView3: TextView
    private lateinit var clickbutton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        counter.findViewById<>(R.id.click_button)

        clickbutton.setOnClickListener {
            count++
            counter = "$count"
        }

    }
}