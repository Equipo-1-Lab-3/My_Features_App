package com.santiagotorres.myfeaturesapp.ui.area_cuadro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import com.santiagotorres.myfeaturesapp.R
import com.santiagotorres.myfeaturesapp.databinding.ActivityAreaCuadradoBinding

class AreaCuadradoActivity : AppCompatActivity() {
    private lateinit var areaCuadradoBinding: ActivityAreaCuadradoBinding
    private lateinit var areaCuadradoViewModel: AreaCuadradoViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        areaCuadradoBinding=ActivityAreaCuadradoBinding.inflate(layoutInflater)
        areaCuadradoViewModel=ViewModelProvider(this)[AreaCuadradoViewModel::class.java]
        val view=areaCuadradoBinding.root
        setContentView(view)

        val calculoObserver = Observer<Double>{resultado->
            areaCuadradoBinding.cuadradoResultText.text=resultado.toString()
        }
        areaCuadradoViewModel.resultado.observe(this,calculoObserver)

        areaCuadradoBinding.cuadradoButton.setOnClickListener{
            areaCuadradoViewModel.calculo(areaCuadradoBinding.alturaInput.text.toString().toDouble(),areaCuadradoBinding.anchoInput.text.toString().toDouble())
        }
    }
}