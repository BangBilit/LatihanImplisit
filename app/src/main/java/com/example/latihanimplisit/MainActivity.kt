package com.example.latihanimplisit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val _layoutEmail = findViewById<LinearLayout>(R.id.layoutEmail)
        val _layoutPhone = findViewById<LinearLayout>(R.id.layoutPhone)
        val _layoutRole = findViewById<LinearLayout>(R.id.LayoutRole)

        _layoutEmail.setOnClickListener {
            val _emailIntent = Intent(
                Intent.ACTION_SENDTO,
                Uri.parse("mailto:sarah@school.edu"))

            startActivity(_emailIntent)
        }

        _layoutPhone.setOnClickListener {
            val _phoneIntent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:+15559876547"))

            startActivity(_phoneIntent)
        }

        _layoutRole.setOnClickListener {
            val _roleIntent = Intent(this, MainActivity2::class.java)
            startActivityForResult(_roleIntent, 100)
        }

    }
}