package com.faniillahi.uts_fani_illahi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpScreen : AppCompatActivity() {
    private lateinit var loginsc : TextView
    private lateinit var loginsc2 : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_screen)

        loginsc = findViewById(R.id.loginsc)
        loginsc2 = findViewById(R.id.loginsc2)

        loginsc.setOnClickListener(){
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }
        loginsc2.setOnClickListener(){
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
