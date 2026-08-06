import java.time.LocalDate

class Servico {
    var instalador : Instalador = Instalador()
    var preco : String = "0.0"
    var dataInstalacao : LocalDate = LocalDate.of(1970, 7, 4)
    var cliente : String = "nome do cliente"
}