package com.example.primeiraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            var nome = binding.editNome.text.toString()
            binding.textResultado.setText("Olá $nome")
        }
    }
}