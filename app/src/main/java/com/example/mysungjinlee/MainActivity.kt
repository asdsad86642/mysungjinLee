package com.example.mysungjinlee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.mysungjinlee.databinding.ActivityMainBinding
import com.example.mysungjinlee.databinding.DialogInputBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dialogBinding = DialogInputBinding.inflate(layoutInflater)
        AlertDialog.Builder(this).run {
            setTitle("당신의 성별은 무엇 입니까?")
            setView(dialogBinding.root)
            setPositiveButton("닫기" , null)
            show()
        }
    }
}