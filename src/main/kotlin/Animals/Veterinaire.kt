package Animals

import Animals.Animal

class Veterinaire {
    public fun treatAnimal(animal : Animal){
        println("Eat: ${animal.food} at : ${animal.location}")
    }
}