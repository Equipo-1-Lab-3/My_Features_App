package com.santiagotorres.myfeaturesapp.ui.perimetro_circulo

import android.widget.LinearLayout
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar

class PerimetroCirculoViewModel: ViewModel() {

   val mensaje: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun calculoperimetro(inputRadio: String) {

        if (inputRadio == "" ) {
            mensaje.value = "DESCRIPCIÓN: El campo debe contener un valor."
        }else if (inputRadio == "." ){
            mensaje.value = "DESCRIPCIÓN: El campo debe ser un número."
        }    else {
            var total = 2*Math.PI*inputRadio.toDouble()

            mensaje.value = "El perimetro del círculo es: ${String.format("%.2f",total.toDouble())} cm"



        }
    }

}