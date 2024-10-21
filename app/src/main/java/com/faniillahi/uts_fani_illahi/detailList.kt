package com.faniillahi.uts_fani_illahi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailList : AppCompatActivity() {
    private lateinit var imgdetail : ImageView
    private lateinit var txtdetail : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_list)




        val detailText = intent.getStringExtra("NamaMkan")
        val detailImage = intent.getIntExtra("ImageMkn",0)

        imgdetail = findViewById(R.id.imagedetail)
        txtdetail = findViewById(R.id.txtdsc)



        imgdetail.setImageResource(detailImage)
        txtdetail.setText(detailText)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}