package com.example.tugas_pertemuan_5_ppapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_pertemuan_5_ppapb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PASS = "extra_pass"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            login.setOnClickListener {
                val intentToMainActivity =
                    Intent(this@MainActivity, MainActivity3::class.java)
                intentToMainActivity.putExtra(EXTRA_NAME, Username.text.toString())
                intentToMainActivity.putExtra(EXTRA_PASS, Password.text.toString())
                startActivity(intentToMainActivity)
            }
            register1.setOnClickListener{
                val intentToMainActivity =
                    Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}
