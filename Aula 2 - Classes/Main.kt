/**
 Instanciar: Criar algo, no caso, um Objeto
  Se eu instanciar uma classe, estarei criando um objeto
 * */
fun main(){
    val pessoa : Pessoa = Pessoa()//Isso aqui é um objeto vazio
    pessoa.nome = "Maria"
    pessoa.altura = 1.69
    pessoa.peso = 48.2
    pessoa.cpf = "000.000.000-01"
    pessoa.imc = pessoa.peso / (pessoa.altura*2)
    pessoa.dizerOi()

    val pessoa2 : Pessoa = Pessoa()
    pessoa2.nome = "Fulaninho"

    val mustang : Carro = Carro(dono = pessoa.nome, velocidade = 50.0)//Explicito
    val fusca : Carro = Carro(150.0, "Zé")
    //Implícito, sou obrigado a seguir a ordem dos atributos
}