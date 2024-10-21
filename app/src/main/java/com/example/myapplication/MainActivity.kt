package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var button_activity_segunda : Button
    private lateinit var button_activity_tercera : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initEvent(){
        button_activity_segunda = findViewById(R.id.button_activity_segunda)
        button_activity_tercera = findViewById(R.id.button_activity_tercera)

        button_activity_segunda.setOnClickListener{
            intent = Intent(this, MainActivity2::class.java)
            .apply {
                putExtra("name", "Activity2")
            }
            startActivity(intent)
        }
    }
}