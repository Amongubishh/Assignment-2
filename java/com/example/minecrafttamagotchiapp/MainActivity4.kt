package com.example.minecrafttamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var returntopets1 = findViewById<Button>(R.id.return1)  //declaring buttons
        returntopets1.setOnClickListener {    //controls what happens when it is clicked
            val intent = Intent(this, MainActivity2::class.java)  //when clicked takes it to another ui
            startActivity(intent)
        }

        var feed2btn = findViewById<Button>(R.id.feed2)  //declaring
        val editText: EditText = findViewById(R.id.et11)
        val imageView: ImageView = findViewById(R.id.imageView5)

        var counter = 0

        feed2btn.setOnClickListener {
            counter += 10
            editText.setText(counter.toString())  // code to add 10 when button is pressed

            imageView.setImageResource(R.drawable.axyfood)  //changes image when button is pressed

            var clean2btn = findViewById<Button>(R.id.clean2)
            val editText: EditText = findViewById(R.id.et22)


            var counter = 0

            clean2btn.setOnClickListener {
                counter += 10
                editText.setText(counter.toString())

                imageView.setImageResource(R.drawable.axyclean)


                var play2btn = findViewById<Button>(R.id.play2)
                val editText: EditText = findViewById(R.id.et33)


                var counter = 0

                play2btn.setOnClickListener {
                    counter += 10
                    editText.setText(counter.toString())

                    imageView.setImageResource(R.drawable.axyplay)

                }
            }
        }






                    }
}