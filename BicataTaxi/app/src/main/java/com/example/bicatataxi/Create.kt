package com.example.bicatataxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bicatataxi.R

class Create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        val create: Button? = findViewById(R.id.bt_create)
        val find :Button?=findViewById(R.id.bt_find)

        create?.setOnClickListener{
            val intent = Intent(this,choosepartner::class.java)
            startActivity(intent)
            finish()
        }

        find?.setOnClickListener{
            val intent = Intent(this,choosepartner::class.java)
            startActivity(intent)
            finish()
        }
    }
}