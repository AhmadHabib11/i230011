package com.example.assignment_1
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)


        val createAccountbtn = findViewById<TextView>(R.id.loginbutton)
        val backArrow = findViewById< ImageView>(R.id.backArrow)

        createAccountbtn.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        backArrow.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

    }
}