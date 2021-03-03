package com.example.homeapp001

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3: AppCompatActivity() {
    private lateinit var buttonBlack: Button
    private lateinit var buttonRed: Button
    private lateinit var colorBackg: View
    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    companion object {
        fun getStartIntent(context: Context): Intent {
            val intent = Intent(context, MainActivity3::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        buttonBlack = findViewById(R.id.buttonBlack)
        buttonRed = findViewById(R.id.buttonRed)
        colorBackg = findViewById(R.id.colorBackg)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)

    }
    override fun onStart() {
        super.onStart()
        buttonBlack.setOnClickListener {
            colorBackg.setBackgroundColor(Color.BLACK)
            textView.setTextColor(Color.WHITE)
            textView2.setTextColor(Color.WHITE)

        }
        buttonRed.setOnClickListener {
            colorBackg.setBackgroundColor(Color.RED)
        }
    }

    override fun onStop() {
        super.onStop()
        buttonBlack.setOnClickListener(null)
        buttonRed.setOnClickListener(null)
    }


}