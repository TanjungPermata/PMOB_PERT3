package com.tanjung.posttest3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HasilInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_input)

        val tvFullName = findViewById<TextView>(R.id.tvFullName)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvGender = findViewById<TextView>(R.id.tvGender)

        val fullName = intent.getStringExtra("FULLNAME")
        val username = intent.getStringExtra("USERNAME")
        val age = intent.getStringExtra("AGE")
        val email = intent.getStringExtra("EMAIL")
        val gender = intent.getStringExtra("GENDER")

        tvFullName.text = "Full Name: $fullName"
        tvUsername.text = "Username: $username"
        tvAge.text = "Age: $age"
        tvEmail.text = "Email: $email"
        tvGender.text = "Gender: $gender"
    }

}
