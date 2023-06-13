package Animals

class Cat(food: String, localisation: String, mioler: Int) : Animal(food, localisation) {

    public val mioler = mioler

    override fun eat() {

        println("Cat eat")
    }

    override fun makeNoise() {

        println("mioler ".repeat(mioler))
    }

    override fun sleep() {
        println("cat sleep")
    }
}