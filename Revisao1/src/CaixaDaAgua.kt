import java.math.BigDecimal

class CaixaDaAgua {
    /**
     * Marca, Modelo, Dimensão(altura, largura, profundidade), Cor, Material, Formato, Instalador, Preço, Fornecedor
     * */
    var marca : String = "nome da marca"
    var modelo : String = "nome da modelo"
    var dimensao : MutableList<Double> = mutableListOf(0.0, 0.0, 0.0)
    var cor : String = "nome da cor"
    var material : String = "nome da material"
    var formato : String = "tipo do formato"
    var instalador : Instalador = Instalador()
    var fornecedor : String = "nome do fornecedor"
    var preco : BigDecimal = BigDecimal.ZERO
}