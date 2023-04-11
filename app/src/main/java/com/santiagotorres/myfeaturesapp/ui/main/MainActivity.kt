package com.santiagotorres.myfeaturesapp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santiagotorres.myfeaturesapp.databinding.ActivityMainBinding
import com.santiagotorres.myfeaturesapp.ui.area_cuadro.AreaCuadradoActivity
import com.santiagotorres.myfeaturesapp.ui.perimetro_cuadrado.PerimetroCuadradoActivity
import com.santiagotorres.myfeaturesapp.ui.perimetro_circulo.PerimetroCirculoActivity
import com.santiagotorres.myfeaturesapp.ui.perimetro_rectangulo.PerimetroRectanguloActivity
import com.santiagotorres.myfeaturesapp.ui.area_hexagono.AreaHexagonoActivity
import com.santiagotorres.myfeaturesapp.ui.perimetroPentagono.PerimetroPentagonoActivity
import com.santiagotorres.myfeaturesapp.ui.area_pentagono.AreaPentagonoActivity

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
        mainBinding.AHexagonoButton.setOnClickListener {
            val intentAH = Intent(this, AreaHexagonoActivity::class.java)

            startActivity(intentAH)
        }
        mainBinding.PPentagonoButton.setOnClickListener {
            val  intent =  Intent(this,PerimetroPentagonoActivity::class.java)

            startActivity(intent)
        }
        mainBinding.APentagonoButton.setOnClickListener {
            val  intentAP =  Intent(this,AreaPentagonoActivity::class.java)

            startActivity(intentAP)
        }
    }
} // Yeiner D. Pájaro



