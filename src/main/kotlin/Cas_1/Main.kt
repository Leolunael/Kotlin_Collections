package Cas_1


fun main() {
    val inscrits = sortedSetOf("Zelda", "Mario", "Luigi", "Peach", "Mario", "Zelda")

    println("Liste des participants (triée) :")
    println(inscrits)

    val pseudoRecherche = "Luigi"
    if (pseudoRecherche in inscrits) {
        println("$pseudoRecherche est inscrit.")
    } else {
        println("$pseudoRecherche n'est pas inscrit.")
    }

    val participantsFinal = inscrits.toSet()
}
