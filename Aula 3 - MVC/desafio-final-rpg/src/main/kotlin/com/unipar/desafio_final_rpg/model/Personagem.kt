package com.unipar.desafio_final_rpg.model

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Personagem(
    @Id
    var nome: String,
    var poder: Int,
    var velocidade: Int,
    var vida: Int
)
