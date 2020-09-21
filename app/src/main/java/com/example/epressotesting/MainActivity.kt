package com.example.epressotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var greetButton: View
    private lateinit var greetingView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetButton = findViewById(R.id.greet_button)
        greetingView = findViewById(R.id.greeting)
    }

    fun greet(view: View) {
        greetButton.isEnabled =false
        greetingView.setText(R.string.hello)
    }
}