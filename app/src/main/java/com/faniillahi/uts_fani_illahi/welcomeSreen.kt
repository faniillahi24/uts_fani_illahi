package com.faniillahi.uts_fani_illahi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class welcomeSreen : AppCompatActivity() {
    private lateinit var loginSc : Button
    private lateinit var signSc : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_sreen)

        loginSc = findViewById(R.id.btnLoginsc)
        signSc = findViewById(R.id.btnSignsc)

        loginSc.setOnClickListener(){
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }

        signSc.setOnClickListener(){
            val intent = Intent(this, SignUpScreen::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}