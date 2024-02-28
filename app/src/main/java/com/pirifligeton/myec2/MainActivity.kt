package com.pirifligeton.myec2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pirifligeton.myec2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClick(v: View?) {
        startActivity(Intent(applicationContext, RegistrationActivity::class.java))
    }
}