package com.example.topic4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.topic4.databinding.ActivityLatihan3Binding

class Latihan3 : AppCompatActivity() {
    private lateinit var binding : ActivityLatihan3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihan3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavBar.background = null
        binding.fab.setOnClickListener {
            startActivity(Intent(this,Latihan4::class.java))
        }
        binding.tvCatatanKeuangan.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }


}