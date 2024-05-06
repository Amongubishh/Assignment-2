package com.example.minecrafttamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var returntopets = findViewById<Button>(R.id.returntopets)
        returntopets.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        var feedbtn = findViewById<Button>(R.id.feed)
        val editText: EditText = findViewById(R.id.et1)
        val imageView: ImageView = findViewById(R.id.imageView4)


        var counter = 0

        feedbtn.setOnClickListener {
            counter += 10
            editText.setText(counter.toString())

            imageView.setImageResource(R.drawable.iron_golem_eating)












                        var cleanbtn = findViewById<Button>(R.id.clean)
                        val editText: EditText = findViewById(R.id.et2)


                        var counter = 0

                        cleanbtn.setOnClickListener {
                            counter += 10
                            editText.setText(counter.toString())

                            imageView.setImageResource(R.drawable.cleangolem)


                            var playbtn = findViewById<Button>(R.id.play)
                            val editText: EditText = findViewById(R.id.et3)


                            var counter = 0

                            playbtn.setOnClickListener {
                                counter += 10
                                editText.setText(counter.toString())

                                imageView.setImageResource(R.drawable.iron_fun)


                            }


                        }


                    }
                }
            }
        