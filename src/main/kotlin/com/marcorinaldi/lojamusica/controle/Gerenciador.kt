package com.marcorinaldi.lojamusica.controle

import com.marcorinaldi.lojamusica.objetos.Instrumento

class Gerenciador {

    private val instrumentos = mutableListOf<Instrumento>()

    fun adicionarInstrumento(instrumento: Instrumento) {
        instrumentos.add(instrumento)
    }
}