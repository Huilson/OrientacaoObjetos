open class Pessoa {
    var nome:String = ""
    var peso:Double = 0.0
    var altura:Double = 0.0
    var imc:Double = 0.0
    var cpf:String = ""

    fun dizerOi(){
        println("Oi, eu sou $nome")
    }//Esse é um bom exemplo

    fun calcIMC(){
        imc = peso / (altura*2)
    }//Esse é um bom exemplo de Comportamento
}//fim Pessoa