package Animals

abstract class Animal(food: String, localisation: String) {
    public val food = food
    public val location = localisation

    abstract fun makeNoise()
    abstract fun eat()
    abstract fun sleep()

}