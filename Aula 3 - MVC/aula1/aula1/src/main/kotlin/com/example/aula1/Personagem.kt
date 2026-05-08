package com.example.aula1

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

//Uma entidade é uma classe reconhecida pelo Banco
@Entity
class Personagem (
    @Id //Obrigatoriamente dizer quem é o ID (no caso a PRIMARY KEY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Dizer pro Hibernate quem controla o ID
    val id : Int? = null,
    val nome : String
)

//Por padrão o JPA do Spring já vem com todos as funções básicas (Salvar, buscar, editar, excluir, etc)
@Repository
interface PersonageRepository : JpaRepository<Personagem, Int>

@RestController
class PersonagemController (
    //Toda classe externa precisa ser injetada (Injenção de Dependência)
    val repository : PersonageRepository //Dependência
){

    //O POST Method é usado para mandar requisições como SALVAR ALGO
    @PostMapping()
    fun salvarPersonagem(@RequestBody personagem: Personagem) {
        //O @RequestBody é um JSON que posso escrever no corpo da requisição
        repository.save(personagem)
    }

    //O GET Method é usado para buscar alguma coisa, como uma BUSCA POR ALGO
    @GetMapping()
    fun buscarTodosPersonagens() : List<Personagem>{
        return repository.findAll()
    }

    @GetMapping("/{id}")//Se quero criar uma variável na URL deixo entre parenteses
    //Para chamar essa variavel no código uso a anotação @PathVariabçe
    fun buscarUmPersonagem(@PathVariable id : Int) : Personagem{
        return repository.findById(id).orElseThrow {
            RuntimeException("Não encontrei o id desjeado")
        }
    }
}