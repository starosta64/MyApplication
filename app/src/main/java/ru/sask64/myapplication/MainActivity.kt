package ru.sask64.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var meet:  ImageView
    lateinit var imageButton13: ImageButton
    private lateinit var imageButton14: ImageButton
    private lateinit var imageButton15: ImageButton
    private lateinit var imageButton16: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        meet = findViewById(R.id.meet)
        imageButton13 = findViewById(R.id.imageButton13)
        imageButton14 = findViewById(R.id.imageButton14)
        imageButton15 = findViewById(R.id.imageButton15)
        imageButton16 = findViewById(R.id.imageButton16)

        imageButton13.setOnClickListener(){
            meet.setImageResource(R.drawable.scale1200)
            meet.rotation = 360F
        }
        imageButton14.setOnClickListener(){
            meet.setImageResource(R.drawable.scale1200)
            meet.rotation = 90F
        }
        imageButton15.setOnClickListener(){
            meet.setImageResource(R.drawable.scale1200)
            meet.rotation = 180F
        }
        imageButton16.setOnClickListener(){
            meet.setImageResource(R.drawable.scale1200)
            meet.rotation = 270F
        }



    }
}