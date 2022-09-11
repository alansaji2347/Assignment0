open class Square : Shape("Square") {

    private var length = 0.0
    private var height = 0.0

    fun setDimensions() {
        println("Enter the length of Square: ")
        length = readLine()?.toDouble() ?: 0.0
        println("Enter the height of Square: ")
        height = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("Length: $length\nHeight is: $height")

    }

    override fun getArea(): Double {
        return length*height
    }

}