open class Circle : Shape("Circle") {

    private var radius = 0.0

    fun setDimensions() {
        println("\nEnter the Radius of the Circle: ")
        radius = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("Radius is: $radius")
    }

    override fun getArea(): Double {
        return radius*radius*Math.PI
    }

}
