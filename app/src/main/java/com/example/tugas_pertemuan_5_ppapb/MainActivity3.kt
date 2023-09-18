package com.example.tugas_pertemuan_5_ppapb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_pertemuan_5_ppapb.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email = intent.getStringExtra(MainActivity2.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity2.EXTRA_PHONE)
        with(binding){
            usernameDone.text = "Welcome $name"
            emailDone.text = "Your $email has been activated"
            phoneDone.text = "Your $phone has been registered"
        }
    }
}
