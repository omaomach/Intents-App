package com.omao.explicitintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Receiving Data From the First Activity
        val bundle: Bundle? = intent.extras
        val name = bundle?.get("name")

        Toast.makeText(this,
        "Your name is $name",
            Toast.LENGTH_LONG
        ).show()

    }
}