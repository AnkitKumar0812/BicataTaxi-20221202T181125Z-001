package com.example.bicatataxi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bicatataxi.R

class RideChoice : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ride_choice)

        val bt_regular:Button?=findViewById(R.id.bt_regular)
        val bt_general:Button?=findViewById(R.id.bt_general)

        bt_regular?.setOnClickListener{
            val intent = Intent(this,BookActivity::class.java)
            startActivity(intent)
            finish()

        }

        bt_general?.setOnClickListener{
            val intent = Intent(this,generalactivity::class.java)
            startActivity(intent)
            finish()

        }


    }
}