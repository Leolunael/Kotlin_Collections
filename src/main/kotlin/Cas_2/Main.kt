package Cas_2

fun main() {
    var clients = ArrayDeque<String>()
    clients.add("Aie")
    clients.add("Ouille")
    clients.add("Bobo")
    clients.add("mal")
    println(clients.removeFirst())
    println(clients.first())


    while (clients.isNotEmpty()) {
        println("Appuyez sur Entrée pour traiter le prochain client...")
        readLine()

        val client = clients.removeFirst()
        println("Client en cours de traitement : $client")
        println("Clients restants : ${clients.size}")
    }

    println("C'est l'heure de la pause.")
}
