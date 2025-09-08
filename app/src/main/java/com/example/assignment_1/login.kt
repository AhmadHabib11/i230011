package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val backarrow = findViewById<ImageView>(R.id.backArrow)

        backarrow.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val login = findViewById< TextView>(R.id.loginbar)

        login.setOnClickListener {
            val intent = Intent(this, feedpage::class.java)
            startActivity(intent)
        }

        val signup = findViewById< TextView>(R.id.signup)

        signup.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

    }
}

