package com.santiagotorres.myfeaturesapp.ui.area_triangulo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AreaTrianguloViewModel: ViewModel() {

    val mensaje: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun Calculo_area_triangulo(inputBase: String, inputAltura: String){

        if (inputBase == ""|| inputAltura=="" ) {
            mensaje.value = "DESCRIPCIÓN: El campo debe contener un valor."
        }else if (inputBase == "."|| inputAltura=="." ){
            mensaje.value = "DESCRIPCIÓN: El campo debe ser un número."
        }
        else{
            var Total=(inputBase.toDouble()*inputAltura.toDouble())/(2)
            mensaje.value = "El área del tríangulo es: ${String.format("%.2f",Total.toDouble())}"

        }
    }


}