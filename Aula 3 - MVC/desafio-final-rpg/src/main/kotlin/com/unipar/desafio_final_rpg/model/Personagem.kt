package com.unipar.desafio_final_rpg.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Personagem(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var nome: String,
    var poder: Int,
    var velocidade: Int,
    var vida: Int
)
