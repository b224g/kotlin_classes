package Animals

class Horse(food: String, localisation: String, vitesse: Double): Animal(food, localisation) {
    public val vitesse = vitesse
    override fun eat() {
        println("horse eat")
    }

    override fun makeNoise() {
        println("horse make noise")
    }

    override fun sleep() {
        println("horse sleep")
    }
}