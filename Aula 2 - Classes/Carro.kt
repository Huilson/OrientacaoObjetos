class Carro(
    val velocidade : Double, //Sou obrigado a dar uma velocidade ao carro
    val dono : String
) {
    fun atropelarPessoa(pessoa: Pessoa){
        println("O carro atropelou ${pessoa.nome} em $velocidade km/h")
    }
}
//Instanciar um carro, dar uma nova velocidade e atropelar a Pessoa