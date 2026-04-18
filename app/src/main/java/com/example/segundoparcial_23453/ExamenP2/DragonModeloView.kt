package com.example.segundoparcial_23453.ExamenP2

import com.example.segundoparcial_23453.R


class DragonModeloView {
    fun getProducts(): List<DragonModelo>{
        var productList = mutableListOf< DragonModelo>()
        productList.add(DragonModelo(nombre = "Trueno Tambor", imagen =R.drawable.trueno01, clase = "Marejada", descripcion = "Este solitario dragon habita cuevas" ))
        productList.add(DragonModelo(nombre = "Cortaleña", imagen =R.drawable.cortalena01, clase = "Afilada", descripcion = "Este solitario dragon habita cuevas" ))
        productList.add(DragonModelo(nombre = "Caldero", imagen =R.drawable.caldero01, clase = "Marejada", descripcion = "Este solitario dragon habita cuevas" ))
        productList.add(DragonModelo(nombre = "Metamorfala", imagen =R.drawable.metamorfala01, clase = "Misterio", descripcion = "Este solitario dragon habita cuevas" ))
        productList.add(DragonModelo(nombre = "Muerte Susurrante", imagen =R.drawable.muerte01, clase = "Piedra", descripcion = "Este solitario dragon habita cuevas" ))
        productList.add(DragonModelo(nombre = "Trueno Tambor", imagen =R.drawable.embestida, clase = "Embestida", descripcion = "Este solitario dragon habita cuevas" ))
        return productList
    }
}