fun calcular() {
    var nome: String = "" //var é mútavel, ou seja, pode mudar seu valor durante a execução
    val sobrenome = "Fulano" //val é imutável, seu valor nunca muda
    nome = readln() //leitura do teclado
    println("Hello World! $nome e $sobrenome")

//--------------------------
    val idadeString: String = readln()//Leitura do teclado sempre é String
    val idadeInteiro: Int = idadeString.toInt() + 10//conversão de tipos
    print("Idade Inteiro: $idadeInteiro")


    //DESAFIO EASY
    println("Digite uma operação simples")
    val operacao = readln().trim()
    var resultado = 0


    if (operacao.contains("+")) {
        resultado = operacao.first().toString().toInt() + operacao.last().toString().toInt()
        val num = operacao.split('+')
        val soma = num[0] + num[1]
        println("A soma é $soma")
    }
    if (operacao.contains("-")) {

    }
    if (operacao.contains("*")) {

    }
    if (operacao.contains("/")) {

    }

    println("Resultado: $resultado")

}