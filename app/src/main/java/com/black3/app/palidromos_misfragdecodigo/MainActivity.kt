package com.black3.app.palidromos_misfragdecodigo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AlphabetIndexer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    var palabra = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = mutableListOf("Johnny","Luis","Pedro","Ana","johnny", "luis","Sofia", "Irene",1,2,3,4,5,6,7,8,9,10,"11")
        for (datosLista in lista){
            if (datosLista is String)
                println(datosLista)
                println()
        }
        (30..35).map {
            lista.add(it)
            println(lista)
        }
        btn_revisar.setOnClickListener {
            validarPalabra()
        }

    }
    fun validarPalabra() {
        palabra = et_palabra.text.toString()
        val reverse = palabra.reversed()
        val cantidad = palabra.length
        tv_cantidad.text = cantidad.toString()
        if (palabra.contains(reverse, ignoreCase = true)) {
            Toast.makeText(this,"$palabra es una palabra palíndromo !!!",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "$palabra no es una palabra palíndromo !!!",Toast.LENGTH_LONG).show()
        }
    }

}
