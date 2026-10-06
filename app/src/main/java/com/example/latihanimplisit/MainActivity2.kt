package com.example.latihanimplisit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val _btnAdmin = findViewById<Button>(R.id.btnAdmin)
        val _btnUser = findViewById<Button>(R.id.btnUser)
        val _btnGuest = findViewById<Button>(R.id.btnGuest)

        _btnAdmin.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("ROLE", "Admin")
            setResult(RESULT_OK,resultIntent)
            finish()
        }

        _btnUser.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("ROLE", "User")
            setResult(RESULT_OK,resultIntent)
            finish()
        }

        _btnGuest.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("ROLE", "Guest")
            setResult(RESULT_OK,resultIntent)
            finish()
        }



    }
}