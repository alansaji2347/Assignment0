fun main(args: Array<String>) {

    val square = Square()
    square.setDimensions()
    square.printDimensions()
    println("Area is: " + square.getArea())

    val circle = Circle()
    circle.setDimensions()
    circle.printDimensions()
    println("Area is: " + circle.getArea())

    val triangle = Triangle()
    triangle.setDimensions()
    triangle.printDimensions()
    println("Area is: " + triangle.getArea())

    val equilateralTriangle = EquilateralTriangle()
    equilateralTriangle.setDimensions()
    equilateralTriangle.printDimensions()
    println("Area is: " + equilateralTriangle.getArea())

}