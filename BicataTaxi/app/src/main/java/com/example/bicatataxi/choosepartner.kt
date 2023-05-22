package com.example.bicatataxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bicatataxi.R

class choosepartner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosepartner)
     val gender:Button?=findViewById(R.id.bt_gender)
        val bt_female:Button?=findViewById(R.id.bt_female)

        gender?.setOnClickListener{
            val intent = Intent(this,RideChoice::class.java)
            startActivity(intent)
            finish()

        }
        bt_female?.setOnClickListener{
            val intent = Intent(this,RideChoice::class.java)
            startActivity(intent)
            finish()

        }
    }
}