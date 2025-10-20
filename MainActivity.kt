package com.tanjung.posttest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFullName = findViewById<EditText>(R.id.etFullName)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val rgGender = findViewById<RadioGroup>(R.id.rgGender)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val selectedGenderId = rgGender.checkedRadioButtonId
            val gender = if (selectedGenderId != -1) {
                findViewById<RadioButton>(selectedGenderId).text.toString()
            } else {
                ""
            }

            val intent = Intent(this, HasilInputActivity::class.java)
            intent.putExtra("FULLNAME", etFullName.text.toString())
            intent.putExtra("USERNAME", etUsername.text.toString())
            intent.putExtra("AGE", etAge.text.toString())
            intent.putExtra("EMAIL", etEmail.text.toString())
            intent.putExtra("GENDER", gender)
            startActivity(intent)
        }
    }
}
