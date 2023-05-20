package com.caroline.bananas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caroline.bananas.databinding.ActivityTypesBinding

class TypesActivity : AppCompatActivity() {
    lateinit var binding: ActivityTypesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTypesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chidrenButton.setOnClickListener {
            startActivity(Intent(this, ChildActivity::class.java))
        }

        binding.adolescentsButton.setOnClickListener {
            startActivity(Intent(this, YoungActivity::class.java))
        }

        binding.adultsButton.setOnClickListener {
            startActivity(Intent(this, AdultActivity::class.java))
        }
    }
}