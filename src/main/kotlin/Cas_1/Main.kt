package Cas_1


fun main() {
    val inscrits = sortedSetOf("Do", "Ré", "Mi", "Fa", "Ré", "Do")

    println("Liste des participants (triée) :")
    println(inscrits)

    val pseudoRecherche = "Mi"
    if (pseudoRecherche in inscrits) {
        println("$pseudoRecherche est inscrit.")
    } else {
        println("$pseudoRecherche n'est pas inscrit.")
    }

    val participantsFinal = inscrits.toSet()
}
