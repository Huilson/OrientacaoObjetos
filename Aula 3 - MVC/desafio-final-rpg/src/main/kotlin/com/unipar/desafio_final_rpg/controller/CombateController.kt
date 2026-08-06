package com.unipar.desafio_final_rpg.controller

import com.unipar.desafio_final_rpg.model.Personagem
import com.unipar.desafio_final_rpg.service.PersonagemService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestClient

@RestController
@RequestMapping("/combate")
class CombateController(
    // @Value injeta o valor da propriedade "rival.url" do application.properties
    // Ex: rival.url=http://192.168.1.12:8080/ouvir
    // Isso evita hardcodar IPs/URLs no código
    @Value("\${rival.url}") private val rivalUrl: String,
    // RestClient é o cliente HTTP do Spring (substituto moderno do RestTemplate)
    // Usado para fazer requisições HTTP para outros servidores
    val restClient: RestClient,
    val personagemService: PersonagemService
) {
    var minhaEscolhaDePersonagem = Personagem("", 0, 0, 0)
    //Para acessar o atacar agora eu uso: localhost:8080/combate/atacar
    @GetMapping("/atacar")
    fun atacar() {
        println("Estou atacando meu rival")
        try {
            restClient.put()
                .uri(rivalUrl).contentType(MediaType.TEXT_PLAIN)
                .body(minhaEscolhaDePersonagem.poder.toString())
                .retrieve().toBodilessEntity()
        } catch (e: Exception) {
            println("Deu erro: ${e.message}")
        }
    }

    //Quando for atualizar algo que já existe, e quero garantir
    //que a chave primária não seja afetada, utilizo o método
    //PUT ou PATCH
    @PutMapping("/apanhar", consumes = [MediaType.TEXT_PLAIN_VALUE])
    fun apanhar(@RequestBody poder: Int) {
        println("Escolha seu personagem: ")
        print(personagemService.buscarTodos().forEach {
            println(it.nome)
        })
        //Aqui o usuário vai digitar o nome que desejar jogar
        val personagem = readln()
        try {
            // busca para ver se o personagem está no banco
            minhaEscolhaDePersonagem = personagemService.buscarPorNome(personagem)
            minhaEscolhaDePersonagem.vida -= poder //Desconta a vida de acordo com o soco
            personagemService.salvar(minhaEscolhaDePersonagem) // salva a nova vida no banco
        }catch (e: Exception) {
            println("Personagem não encontrado")
        }
    }

    //Não é uma requisição HTTP
    @GetMapping("/escolha/{nome}")
    fun escolherMeuPersonagem(@PathVariable nome: String): Personagem {
        /*println("Escolha seu personagem: ")
        print(personagemService.buscarTodos().forEach {
            println(it.nome)
        })*/
        //Aqui o usuário vai digitar o nome que desejar jogar
        //val personagem = readln()
        try {
            // busca para ver se o personagem está no banco
            minhaEscolhaDePersonagem = personagemService.buscarPorNome(nome)
            println("Personagem escolhido para combate: $minhaEscolhaDePersonagem")
        }catch (e: Exception) {
            println("Personagem não encontrado")
        }
    return minhaEscolhaDePersonagem
    }
}