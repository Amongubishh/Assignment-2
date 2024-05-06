package com.example.minecrafttamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startbutton = findViewById<Button>(R.id.startbutton)   //the declaring of buttons
        startbutton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)  //this makes it lead to another ui
            startActivity(intent)
        }






    }
}