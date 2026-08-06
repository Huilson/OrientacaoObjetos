class Cliente {
    var nome: String = ""
    var cpf: String = ""
    var idade: Int = 0
    var dividasAbertas: Boolean = true
    var parcelasAPagar : MutableList<Double> = mutableListOf(0.0, 0.0, 0.0)
}