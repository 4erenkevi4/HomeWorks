package com.example.homeapp001

import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_SEND
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private lateinit var buttonShare: Button

    companion object {
        val EXTRA_TEXT = "ExtraText"

        fun getStartIntent(context: Context, text: String): Intent {
            val intent = Intent(context, MainActivity2::class.java)
            intent.putExtra(EXTRA_TEXT, text)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<TextView>(R.id.textView2).text =
            intent.getStringExtra(EXTRA_TEXT)
    }

    override fun onStart() {
        super.onStart()
        handleClicks()
    }

    private fun handleClicks() {
        buttonShare = findViewById<Button>(R.id.buttonShare)
        buttonShare?.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = ACTION_SEND
            sendIntent.type = "text/plain"
            startActivity(Intent.createChooser(sendIntent, "Share"))
        }
    }

    override fun onStop() {
        super.onStop()
        buttonShare.setOnClickListener(null)
    }
}
