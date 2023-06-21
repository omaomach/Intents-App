package com.omao.explicitintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv1: TextView = findViewById(R.id.tv1)
        var btn1: Button = findViewById(R.id.btn1)

        btn1.setOnClickListener() {
            // Explicit Intents
            var i =  Intent(this, SecondActivity::class.java)

            // Passing Data between Activities
            i.putExtra("name", "Joash")

            startActivity(i)
        }

    }
}