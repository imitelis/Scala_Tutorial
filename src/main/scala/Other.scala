// Other.scala
object Other {
  val PI: Double = 3.14159

  def calculateArea(radius: Double): Double = {
    PI * radius * radius
  }

  def main(): Unit = {
    val radius = 5.0
    val area = calculateArea(radius)
    println(s"Area of the circle with radius $radius: $area")
  }
}