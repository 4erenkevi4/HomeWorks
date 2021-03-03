package com.example.homeapp001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        handleClicks()
}
    private fun handleClicks() {
        button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val editText = findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()
            startActivity(MainActivity2.getStartIntent(this, text))
        }
        button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intentact = Intent(this, MainActivity3::class.java)
            startActivity(MainActivity3.getStartIntent(this))
        }
        }

    override fun onStop() {
        super.onStop()
        button1.setOnClickListener(null)
        button2.setOnClickListener(null)
    }
    }
