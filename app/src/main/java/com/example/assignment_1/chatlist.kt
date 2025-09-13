package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class chatlist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chatlist)

        val backarrow = findViewById<ImageView>(R.id.backArrow)
        val chat1 = findViewById<LinearLayout>(R.id.chat1)
        val chat2 = findViewById<LinearLayout>(R.id.chat2)
        val chat3 = findViewById<LinearLayout>(R.id.chat3)
        val chat4 = findViewById<LinearLayout>(R.id.chat4)
        val chat5 = findViewById<LinearLayout>(R.id.chat5)
        val chat6 = findViewById<LinearLayout>(R.id.chat6)

        backarrow.setOnClickListener {
            val intent = Intent(this, feedpage ::class.java)
            startActivity(intent)
            finish()
        }
        chat1.setOnClickListener {
            val intent = Intent(this, dmscreen ::class.java)
            startActivity(intent)
        }
        chat2.setOnClickListener {
            val intent = Intent(this, dmscreen ::class.java)
            startActivity(intent)
        }
        chat3.setOnClickListener {
            val intent = Intent(this, dmscreen ::class.java)
            startActivity(intent)
        }
        chat4.setOnClickListener {
            val intent = Intent(this, dmscreen ::class.java)
            startActivity(intent)
        }
        chat5.setOnClickListener {
            val intent = Intent(this, dmscreen ::class.java)
            startActivity(intent)
        }
        chat6.setOnClickListener {
            val intent = Intent(this, dmscreen ::class.java)
            startActivity(intent)
        }


    }
}