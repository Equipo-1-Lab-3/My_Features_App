package com.santiagotorres.myfeaturesapp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santiagotorres.myfeaturesapp.databinding.ActivityMainBinding
import com.santiagotorres.myfeaturesapp.databinding.ActivityMainBinding
import com.santiagotorres.myfeaturesapp.ui.area_cuadro.AreaCuadradoActivity
import com.santiagotorres.myfeaturesapp.ui.perimetro_cuadrado.PerimetroCuadradoActivity
import com.santiagotorres.myfeaturesapp.ui.area_pentagono.AreaPentagonoActivity
import com.santiagotorres.myfeaturesapp.ui.perimetro_circulo.PerimetroCirculoActivity
import com.santiagotorres.myfeaturesapp.ui.perimetro_rectangulo.PerimetroRectanguloActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding =  ActivityMainBinding.inflate(layoutInflater)

        val view = mainBinding.root
        setContentView(view)

        mainBinding.PCirculoButton.setOnClickListener {
            val  intentPC =  Intent(this,PerimetroCirculoActivity::class.java)


            startActivity(intentPC)
        }
        mainBinding.PRectanguloButton.setOnClickListener {
            val  intentPR =  Intent(this,PerimetroRectanguloActivity::class.java)

            startActivity(intentPR)
        }
        mainBinding.ACuadroButton.setOnClickListener{
            val intentAC = Intent(this,AreaCuadradoActivity::class.java)

            startActivity(intentAC)
        }
        mainBinding.PCuadroButton.setOnClickListener {
            val intentPCu = Intent(this, PerimetroCuadradoActivity::class.java)

            startActivity(intentPCu)
        }
    }
} // Yeiner D. Pájaro





