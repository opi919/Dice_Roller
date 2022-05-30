package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var dice_image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button);
        rollButton.setOnClickListener {
//            Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
            rollDice();
        }
        dice_image = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
//        TODO("Not yet implemented")
        var random = Random.nextInt(6) + 1;
        var drawableResources = when (random){
            1 -> R.drawable.dice_1
            2-> R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> {
                R.drawable.dice_6
            }
        }
        dice_image.setImageResource(drawableResources)
    }
}