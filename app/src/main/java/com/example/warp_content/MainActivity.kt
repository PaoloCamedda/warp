package com.example.warp_content

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var browserIntent : Intent

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pulsante = findViewById<Button>(R.id.start)
        val pulsante2 = findViewById<Button>(R.id.toast)
        //val pulsante3 = findViewById<Button>(R.id.toastandroid)

        pulsante.setOnClickListener{
            goWeb()
        }

        pulsante2.setOnClickListener{
            riseAToast()
        }

    }

    private fun goWeb(){

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/PaoloCamedda?tab=repositories"))
        startActivity(browserIntent)
    }

    private fun riseAToast(){
        Toast.makeText(getApplicationContext(),  "Look profile ", Toast.LENGTH_LONG).show();
    }



}
