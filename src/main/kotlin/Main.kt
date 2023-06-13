import Animals.*
import Mots.Words
import Message.Message

fun main() {
    println("Задание 1:")

    val debut = Words()

    println("Задание 2:")

    var nomUtilisateur = "biro barry"
    val message = Message(nomUtilisateur)
    message.presentation()

    println("Задание 3:")

    var animal = arrayListOf<Animal>(Cat("pain","abidjan",5), Dog("viande", "Paris", 5), Horse("herbe", "Hollywood", 90.0))

    println("Animals eat:")

    animal.forEach{
        it.eat()
    }
    println(" Animals communicate :")
    animal.forEach{
        it.makeNoise()
    }
    println("Animals sleep:")
    animal.forEach{
        it.sleep()
    }
    println("Animals at the veterinarian's office:")
    var veterin = Veterinaire()
    animal.forEach {
        veterin.treatAnimal(it)
    }


}