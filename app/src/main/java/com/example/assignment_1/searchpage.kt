package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class searchpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.searchpage)

        val notif = findViewById<ImageView>(R.id.notifIcon)
        val home = findViewById<ImageView>(R.id.homeIcon)
        val search = findViewById<ImageView>(R.id.searchicon21)
        val profile = findViewById<ImageView>(R.id.profileIcon)
        val create = findViewById<ImageView>(R.id.reelsIcon)



        notif.setOnClickListener {
            val intent = Intent(this, notifications ::class.java)
            startActivity(intent)
            finish()

        }
        home.setOnClickListener {
            val intent = Intent(this, feedpage ::class.java)
            startActivity(intent)
            finish()
        }
        search.setOnClickListener {
            val intent = Intent(this, typesearch ::class.java)
            startActivity(intent)
            finish()
        }
        profile.setOnClickListener {
            val intent = Intent(this, profile ::class.java)
            startActivity(intent)
            finish()
        }
        create.setOnClickListener {
            val intent = Intent(this, createpost ::class.java)
            startActivity(intent)
            finish()
        }


    }
}