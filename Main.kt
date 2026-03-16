import java.lang.Thread.sleep
import kotlin.random.Random

//Use ALT e ENTER para importar mais rápido

fun main() {
    val numero = Random.nextInt(1, 11)
    println("$numero")//Crio um número aleatório de 1 a 10
}

fun criarPilha() {
    val pilha: ArrayDeque<String> = ArrayDeque<String>()
    pilha.add("Ás de Paus")//adicionado no topo da pilha
    pilha.add("Dois de Ouro")//adicionado no topo da pilha
    pilha.add("Três de Copas")//adicionado no topo da pilha
    pilha.add("Quatro de Espada")//adicionado no topo da pilha

    println("A carta no topo da pilha é ${pilha.last()}")

    pilha.removeLast()//remove o elemento no topo da pilha
    println("A nova carta no topo é ${pilha.last()}")
}

fun criarFila() {
    val fila: ArrayDeque<String> = ArrayDeque<String>()
    fila.addLast("Fulano")
    fila.addLast("Mariazinha")
    fila.addLast("Paulinho")
    fila.addLast("Joãozinho")

    println("O primeiro a ser atendido é ${fila.removeFirst()}.")
}

fun criarThread(){
    val t1 = Thread {
        sleep(1000)//Sleep faz a Thread esperar
        for (i in 1..100) {
            print(" $i")
        }
    }
    t1.start()//Sempre será preciso inicializar um Thread
    t1.name = "Thread 1" //Renomear Thread
    println("${t1.name} ainda está operando?")

    //t1.interrupt()//mata a Thread, cuidado ao usar essa função encadeada

    when(t1.isAlive){//Verifica se uma Thread terminou sua execução
        true -> {println("SIM!")}
        false -> {println("NÃO!")}
    }
    t1.join()//Trava as Thread subsequentes

    val t2 = Thread {
        print(" ACABOU!")
    }.start()

    println("T1 ainda está operando?")
    when(t1.isAlive){//Verifica se uma Thread terminou sua execução
        true -> {println("SIM!")}
        false -> {println("NÃO!")}
    }
    /**
     * LAMBDA -> significa ação
     * DIAMANTE <> significa tipagem
     */

    val t3 = Thread {
        for(i in 1..10) {
            print(" $i")
        }
    }
    val t4 = Thread {
        for(i in 11..20) {
            print(" $i")
        }
    }
    val t5 = Thread {
        for(i in 30..31) {
            print(" $i")
        }
    }
    t3.start()
    t4.start()
    t5.start()

    t3.priority = Thread.MIN_PRIORITY
    t4.priority = Thread.NORM_PRIORITY
    t5.priority = Thread.MAX_PRIORITY
}

