package com.example.classwork2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classwork2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var data = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnAdd.setOnClickListener {
                if (editText.text.isNotEmpty()){
                    data.add(editText.text.toString())
                }
                editText.text.clear()
            }
            btnPrint.setOnClickListener {
               textView.text = data.toString()
            }
        }
    }
}