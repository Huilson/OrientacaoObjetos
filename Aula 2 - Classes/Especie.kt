class Especie {
    private var nome: String = "Toby"
    private var peso : Double = 0.0

    //Função para editar o atributo
    fun setNome(nome: String) {
        this.nome = nome//Leitura
    }
    //Função para acessar o dado do atributo
    fun getNome(): String {
        return nome//Escrita
    }
}