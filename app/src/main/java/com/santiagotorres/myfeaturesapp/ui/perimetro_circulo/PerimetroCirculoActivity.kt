package com.santiagotorres.myfeaturesapp.ui.perimetro_circulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityPerimetroCirculoBinding
import java.text.DecimalFormat

class PerimetroCirculoActivity : AppCompatActivity() {

    private lateinit var perimetroCirculoBinding: ActivityPerimetroCirculoBinding
    private lateinit var perimetroCirculoViewModel: PerimetroCirculoViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        perimetroCirculoBinding = ActivityPerimetroCirculoBinding.inflate(layoutInflater)

        perimetroCirculoViewModel = ViewModelProvider(this)[PerimetroCirculoViewModel::class.java]




        val mensajeObserver = Observer<String>{mensaje ->
            perimetroCirculoBinding.totalTextView.text=mensaje
        }
        perimetroCirculoViewModel.mensaje.observe(this, mensajeObserver)

        perimetroCirculoBinding.calcularPerimetroButton.setOnClickListener {
            perimetroCirculoViewModel.calculoperimetro(perimetroCirculoBinding.RadioInput.text.toString())
        }

        val view = perimetroCirculoBinding.root
        setContentView(view)
    }

}