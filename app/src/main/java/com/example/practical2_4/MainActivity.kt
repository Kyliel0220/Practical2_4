package com.example.practical2_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical2_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //val tv :TextView = findViewById(R.id.tvName)

        val s: Student = Student("W123","John")

        binding.myData = s
        binding.btnUpdate.setOnClickListener(){
            s.studentName = "Alex"

            binding.apply {
                invalidateAll()
            }
        }

    }
}