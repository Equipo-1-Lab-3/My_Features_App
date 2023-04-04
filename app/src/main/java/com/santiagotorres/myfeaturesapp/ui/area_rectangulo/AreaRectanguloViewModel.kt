package com.santiagotorres.myfeaturesapp.ui.area_rectangulo

import android.widget.LinearLayout
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar

class AreaRectanguloViewModel: ViewModel() {

    val emptyText: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val Resultado: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }

    fun verificarDatos(baseInput: String, alturaInput : String, layout: LinearLayout) {
        if (baseInput.isEmpty() || baseInput == "0" || alturaInput.isEmpty() || alturaInput=="0"){
            emptyText.value = "Tiene algún valor vacío o en 0"

            Snackbar.make(layout,
                emptyText.value.toString(),
                Snackbar.LENGTH_INDEFINITE).setAction("Aceptar") {
            }.show()
        }
    }

    fun calcularArea(baseInput: String, alturaInput : String) {

        if (baseInput.isEmpty() || baseInput == "0" || alturaInput.isEmpty() || alturaInput=="0"){

        }
        else{
            val base = baseInput.toDouble()
            val altura = alturaInput.toDouble()

            Resultado.value = base * altura
        }

    }


}