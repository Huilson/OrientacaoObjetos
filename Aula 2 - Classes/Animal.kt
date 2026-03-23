/**Classe Mãe ou Raiz*/
open public class Animal(
    val nome: String,
    val peso : Double
)//Construtor semrpe terá uma injeção de depêndencia
{
    open fun fazerBarulho(){
        println("$nome fez um barulho")
    }
}
/**Classe Filha ou Folha*/
//Exemplo 1
class Cachorro (
    nome : String,
    peso : Double)
    : Animal (
    nome,
    peso){
    override fun fazerBarulho(){
        println("O cachorrinho $nome latiu!")
    }
}
//Exemplo 2
class Gato : Animal (nome = "Mimo", peso = 2.0){
    override fun fazerBarulho(){
        println("O gatinho $nome fez miau")
    }
}