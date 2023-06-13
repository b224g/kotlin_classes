package Animals

class Dog(food: String, localisation: String, aboyer: Int):Animal(food, localisation) {
    public val aboyer = aboyer

    override fun eat() {

        println("dog eat")
    }

    override fun makeNoise() {
        println("aboyer".repeat(aboyer))
    }

    override fun sleep() {
        println("dog sleep")
    }
}