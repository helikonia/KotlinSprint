package org.example.lesson18

abstract class Box() {
    open fun square() = 0
}

class RectangleBox(val lengthBox: Int, val widthBox: Int, val heightBox: Int) : Box() {
    override fun square(): Int {
        val squareRectangle = 2 * (lengthBox * widthBox + widthBox * heightBox + lengthBox * heightBox)
        return squareRectangle
    }
}

class CubeBox(val sideLength: Int) : Box() {
    override fun square(): Int {
        val squareCube = 6 * sideLength * sideLength
        return squareCube
    }
}
