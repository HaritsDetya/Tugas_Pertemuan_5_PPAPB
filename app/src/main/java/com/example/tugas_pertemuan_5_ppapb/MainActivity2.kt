package com.example.tugas_pertemuan_5_ppapb

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.text.Html
import android.widget.TextView
import com.example.tugas_pertemuan_5_ppapb.MainActivity.Companion.EXTRA_NAME
import com.example.tugas_pertemuan_5_ppapb.MainActivity.Companion.EXTRA_PASS
import com.example.tugas_pertemuan_5_ppapb.databinding.ActivityMain2Binding

@Suppress("DEPRECATION")
class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var textView: TextView
    companion object{
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        textView=findViewById(R.id.check)
        textView.text=Html.fromHtml("<font color=${Color.BLACK}>By checking the box you agree to our</font>" +
                "<font color=${Color.argb(1,82, 91, 255)}> Terms</font>"
                +"<font color=${Color.BLACK}> and</font>" + "<font color=${Color.argb(1,82, 91, 255)}> Conditions")

        with(binding){
            register.setOnClickListener {
                val resultIntent = Intent(this@MainActivity2, MainActivity3::class.java)
                resultIntent.putExtra(EXTRA_NAME, Username1.text.toString())
                resultIntent.putExtra(EXTRA_EMAIL, email.text.toString())
                resultIntent.putExtra(EXTRA_PHONE, phone.text.toString())
                resultIntent.putExtra(EXTRA_PASS, Password1.text.toString())
                startActivity(resultIntent)
            }
            login1.setOnClickListener{
                val resultIntent =
                    Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(resultIntent)
            }
        }
    }
}