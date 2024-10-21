package com.faniillahi.uts_fani_illahi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginScreen : AppCompatActivity() {

    private lateinit var signsc : TextView
    private lateinit var signsc2 : TextView
    private lateinit var listlogin : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)
        signsc = findViewById(R.id.signsc)
        signsc2 = findViewById(R.id.signsc2)
        listlogin = findViewById(R.id.btnlistlgn)

        signsc.setOnClickListener(){
            val intent = Intent(this, SignUpScreen::class.java)
            startActivity(intent)
        }
        signsc2.setOnClickListener(){
            val intent = Intent(this, SignUpScreen::class.java)
            startActivity(intent)
        }

        listlogin.setOnClickListener(){
            val intent = Intent(this, ListOrderScreen::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}