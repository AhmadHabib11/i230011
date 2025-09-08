package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class authorization : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.authorization)

        val createAccountbtn = findViewById<TextView>(R.id.signupText)

        createAccountbtn.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val switchaccs = findViewById<TextView>(R.id.switchaccounts)

        switchaccs.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        val loginb = findViewById<TextView>(R.id.loginbutton)

        loginb.setOnClickListener {
            val intent = Intent(this, feedpage::class.java)
            startActivity(intent)
        }


    }
}