package com.omao.explicitintents

import android.content.Intent
import android.net.Uri
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
        var btn2: Button = findViewById(R.id.btn2)

        btn1.setOnClickListener() {
            // Explicit Intents
            var i =  Intent(this, SecondActivity::class.java)

            // Passing Data between Activities
            i.putExtra("name", "Joash")

            startActivity(i)
        }

        btn2.setOnClickListener() {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }

    }
}