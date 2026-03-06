fun main() {
    colecoesMapas()
}

fun intervalos(){
    for (i in 1..10) {
        print(" $i")
    }
    //Intervalos: Para dizer que você quer ir de um número a outro basta digitar
    //O primeiro número seguido de .. (dois pontos) e depois o segundo número
    //A palavra chave IN serve para indicar que o intervalo será representado
    //pela variável i

    //Contagem regressiva
    println("Contagem regressiva... \n")
    val x = 5
    for(x in 10 downTo 1 step 2) {
        print(" $x")
    }
    //Para percorrer um intervalo inverso use o DownTo
    //Step são os passos que um intervalo pula
    /**
     * Um bloco de código começa com { (abrir parenteses)
     * E termina com } (fechar parenteses)
     */

    val numeros : IntRange = 1..10
}
fun quando(){
    println("\nDigite um numero de 1 a 7")
    val dia : Int = readln().toInt() //READLN() sempre volta o tipo String

    //A minha condição precisa ser do mesmo tipo (tipagem) das opções
    when (dia) {
        1 -> {
            println("Hoje é domingo dia mais lindo")
            println("Esse é um exemplo de WHEN com mais de uma linha")
        }
        2 -> println("Hoje é segunda dia de labuta")
        3 -> println("Hoje é terça dia de mesa")
        4 -> println("Hoje é quarta de sofá")
        5 -> println("Hoje é quinta tá na mica")
        6 -> println("Hoje é sexta, sem dó da noite")
        7 -> println("Hoje é sábado, moia o gato")
    }
    //Operador Lambda ->
}
fun colecoesArrays(){
    println("Array de String: ")
    val alfabeto = arrayOf("a", "b", "c", "d", "e", "f", "g")

    println("Array de Inteiros: ")
    val numerosPares = arrayOf(2, 4, 6, 8, 10)

    for (i in 0 until alfabeto.size ) {
        println("Letra do alfabeto : ${alfabeto[i]}; index : ${alfabeto.indexOf(alfabeto[i])}")
        if (i < numerosPares.size)
            println("${numerosPares[i]}")
    }
}
fun colecoesMapas(){
    val mapa = mapOf<String, Int>(
        // Primeiro é a chave; Depois do "TO" é o valor
        "Zero" to 0,
        "Tres" to 3,
        "Um" to 1,
        "Dois" to 2
    )//fim do mapa
    //Para acessar o valor, invoque a variável com o nome da chave entre parenteses
    println("Valor do mapa ${mapa["Tres"]}")
    //Acessar cada chave (anonimato)

    var mapaMutavel = mutableMapOf<String, Int>(
        "Zero" to 0,
        "Tres" to 3
    )
    mapaMutavel["Tres"] = 1 //alterar elemento com chave
    mapaMutavel["Dois"] = 2 //criar chave com valor

    println("Adicione uma chave")
    val novaChave = readln()
    mapaMutavel[novaChave] = 10 // adiciona uma nova chave e valor para o Mapa
    println("A nova chave tem o valor ${mapaMutavel[novaChave]}")

    println("Digite a chave que deseja remover")
    val chave = readln()
     // remover por chave
    println("Valor do mapa removido! ${mapaMutavel.remove(chave)}")

    mapaMutavel = mapa.toMutableMap()//Logo terminamos de comprovar a mudança

    //Iterar por Mapas
    mapaMutavel.forEach { numeroExtenso, numeroDigito ->
        println("A chave é $numeroExtenso, o valor da chave é $numeroDigito")
    }
}
fun colecoesListas(){
    val frutas = listOf<String>("Banana", "Maçã", "Uva", "Abacate")
    println("As minhas frutas são: $frutas")
    if(frutas.contains("Banana")){//Retorna true se tem o elemento
        println("Tem banana!")
    }
    println("Minha primeira fruta ${frutas.first()}")//Retorna o primeiro elemento da lista
    println("Minha última fruta ${frutas.last()}")//Retorna o último elemento da lista

    //Iterar por todos os elementos
    frutas.forEach{ fruta -> //para renomear coloque o nome seguido de lambda
        println(fruta)// IT é um objeto anonimo
    }

    val numeros = mutableListOf<Double>(10.1, 4.54, 3.51, 0.007)
    numeros.add(0.001)//adicionar um novo elemento a lista
    numeros.remove(10.1)//remover um elemento da lista
    numeros.sort()//Ordenar uma lista
    println("Os números são $numeros")
}
