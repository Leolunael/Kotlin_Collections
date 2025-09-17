package Cas_3

fun main(){
    var notes = mutableMapOf<String, Double>()
    notes["Do"] = 15.5
    notes["Re"] = 9.0
    notes["Mi"] = 13.0
    notes["Fa"] = 19.0
    notes["Sol"] = 5.0
    println("Notes initiales ajoutées : ${notes.size} élèves")

    var elevesOrdre = notes.keys.toList()
    var troisiemeEleve = elevesOrdre[2]

    println("\nTroisième élève ajouté : $troisiemeEleve")
    println("Note actuelle : ${notes[troisiemeEleve]}")

    notes[troisiemeEleve] = 19.0
    println("Nouvelle note de $troisiemeEleve : ${notes[troisiemeEleve]}")

    var dernierEleve = elevesOrdre.last()
    println("\nDernier élève ajouté : $dernierEleve")
    println("Sa note : ${notes[dernierEleve]}")

    notes.forEach { (eleve, note) ->
        println("$eleve : $note/20")
    }
}