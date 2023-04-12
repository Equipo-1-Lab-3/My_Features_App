package com.santiagotorres.myfeaturesapp.ui.perimetro_cuadrado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityPerimetroCuadradoBinding

class PerimetroCuadradoActivity: AppCompatActivity() {
    private lateinit var perimetroCuadradoBiding: ActivityPerimetroCuadradoBinding
    private lateinit var perimetroCuadradoViewModel: PerimetroCuadradoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        perimetroCuadradoBiding = ActivityPerimetroCuadradoBinding.inflate(layoutInflater)
        perimetroCuadradoViewModel = ViewModelProvider(this)[PerimetroCuadradoViewModel::class.java]
        val view = perimetroCuadradoBiding.root
        setContentView(view)

        val perimetroObserver = Observer<Double>{
            perimetroCuadradoBiding.periResult.text = it.toString()
        }
        perimetroCuadradoViewModel.result.observe(this,perimetroObserver)

        perimetroCuadradoBiding.calcuButton.setOnClickListener{
            perimetroCuadradoViewModel.multi(perimetroCuadradoBiding.ladoInput.text.toString().toDouble())
        }
    }
}