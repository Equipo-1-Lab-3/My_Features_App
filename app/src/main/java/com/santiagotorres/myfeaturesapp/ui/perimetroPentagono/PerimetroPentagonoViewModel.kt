package com.santiagotorres.myfeaturesapp.ui.perimetroPentagono

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PerimetroPentagonoViewModel:ViewModel() {
    val perimetroPentagono: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val errorBasio: MutableLiveData<String?> by lazy {
        MutableLiveData<String?>()
    }

    fun calcularPerimetro(ladoPentagono: String){
        errorBasio.value= null
        perimetroPentagono.value=""
        if (ladoPentagono.isEmpty()){
            errorBasio.value= "La casilla está vacía"
        }else{
            perimetroPentagono.value="El perimetro es: "+(5*(ladoPentagono.toDouble())).toString()+" cm"

        }
    }
}