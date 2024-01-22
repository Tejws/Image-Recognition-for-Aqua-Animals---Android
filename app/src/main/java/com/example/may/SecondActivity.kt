package com.example.may

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val thirdActButton = findViewById<Button>(R.id.third_act_button)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)

        }


            val SeventhActButton = findViewById<Button>(R.id.button3)
            SeventhActButton.setOnClickListener {
                val intent = Intent(this, MainActivity6::class.java)
                startActivity(intent)
            }



                }
            }


