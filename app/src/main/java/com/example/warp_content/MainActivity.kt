package com.example.warp_content

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
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
        val pulsante3 = findViewById<ImageButton>(R.id.toastandroid)

        pulsante.setOnClickListener{
            goWeb()
        }

        pulsante2.setOnClickListener{
            riseAToast()
        }

        pulsante3.setOnClickListener{
            riseAndroid()
                pulsante3.setImageResource(R.drawable.android_button);
        }



    }

    private fun goWeb(){

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/PaoloCamedda?tab=repositories"))
        startActivity(browserIntent)
    }

    private fun riseAToast(){
        Toast.makeText(applicationContext,  "Look profile ", Toast.LENGTH_LONG).show();
    }

    private fun riseAndroid(){
        Toast.makeText(applicationContext,  "Android max ", Toast.LENGTH_LONG).show();
    }


}
