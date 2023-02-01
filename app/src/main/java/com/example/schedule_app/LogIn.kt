package com.example.schedule_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        val signupButton : Button = findViewById<Button>(R.id.SignupButton)
        signupButton.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)

            startActivity(intent)
        }
    }
}

