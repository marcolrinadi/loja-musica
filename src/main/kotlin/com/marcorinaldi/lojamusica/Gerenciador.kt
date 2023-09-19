package com.marcorinaldi.lojamusica

class Gerenciador {

    private val instrumentos = mutableListOf<Instrumento>()

    fun adicionarInstrumento(instrumento: Instrumento) {
        instrumentos.add(instrumento)
    }
}