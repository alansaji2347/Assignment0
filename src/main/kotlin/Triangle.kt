open class Triangle : Shape("Triangle") {

    private var a = 0.0;
    private var b = 0.0;
    private var c = 0.0;

    open fun setDimensions() {
        println("\nEnter First side of Triangle: ")
        a = readLine()?.toDouble() ?: 0.0
        println("Enter Second side of Triangle: ")
        b = readLine()?.toDouble() ?: 0.0
        println("Enter Third side of Triangle: ")
        c = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("First side: $a\nSecond side: $b\nThird side:$c")
    }

    override fun getArea(): Double {
        val s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

}

class EquilateralTriangle : Triangle() {

    private var a = 0.0;

    override fun setDimensions() {
        println("\nEnter side of Equilateral Triangle: ")
        a = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("First side: $a")
    }

    override fun getArea(): Double {
        return (1.73 * a * a)/4
    }

}