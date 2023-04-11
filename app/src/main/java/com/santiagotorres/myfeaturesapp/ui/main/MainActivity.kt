package com.santiagotorres.myfeaturesapp.ui.main

//..
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santiagotorres.myfeaturesapp.R
import com.santiagotorres.myfeaturesapp.databinding.ActivityMainBinding
import com.santiagotorres.myfeaturesapp.ui.area_triangulo.AreaTrianguloActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding =  ActivityMainBinding.inflate(layoutInflater)

        val view = mainBinding.root
        setContentView(view)
        mainBinding.ATrianguloButton.setOnClickListener {
            val intentAT = Intent(this,AreaTrianguloActivity::class.java)
            startActivity(intentAT)
        }
        //si
    }
}