package com.faniillahi.uts_fani_illahi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniillahi.uts_fani_illahi.Adapter.listAdapter
import com.faniillahi.uts_fani_illahi.model.listModel


class ListOrderScreen : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_order_screen)

        val rvList :RecyclerView = findViewById(R.id.rvList)
        rvList.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        val listMkn = listOf(
            listModel("Chicken Curry", R.drawable.makan2, "29 Nov, 01:20pm", "$50.00", "2 items"),
            listModel("Bean and Vegetable", R.drawable.burger2, "10 Nov, 06:00pm", "$50.00", "2 items"),
            listModel("Coffe Latte", R.drawable.coffe, "10 Nov, 08:30pm", "$8.00", "1 items"),
            listModel("StrawberryCheesecake", R.drawable.cake, "03 Oct, 03:30pm", "$22.00", "2 items")


        )
        rvList.adapter = listAdapter(listMkn, this)










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}