package com.santiagotorres.myfeaturesapp.ui.perimetro_rectangulo

import android.widget.LinearLayout
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar


class PerimetroRectanguloViewModel : ViewModel() {


    val Resultado: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }

    val emptyText: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun  verificarDatos(baseInput: String, alturaInput : String, layout: LinearLayout) {

        if (baseInput.isEmpty() || baseInput == "0" || alturaInput.isEmpty() || alturaInput=="0"){
            emptyText.value = "Tiene algún valor vacío o en 0"

            Snackbar.make(layout,
                emptyText.value.toString(),
                Snackbar.LENGTH_INDEFINITE).setAction("Aceptar") {
            }.show()
        }
    }

    fun calcularPerimetro(baseInput: String, alturaInput : String) {

        if (baseInput.isEmpty() || baseInput == "0" || alturaInput.isEmpty() || alturaInput=="0"){

        }
        else{
            var base = baseInput.toDouble()
            var altura = alturaInput.toDouble()

            Resultado.value = (2*base) + (2*altura)
        }
    }


}