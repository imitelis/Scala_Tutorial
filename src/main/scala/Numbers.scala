// Numbers.scala
import scala.math.pow
import scala.math.BigDecimal

object Types {
  val a: Byte = 110
  val b: Short = 510
  val c: Int = 12345
  val d: Long = 123123123
  val e: Float = 9.8
  val g: Double = 9.128
  var h: Array[Int] = Array(1, 2, 3)
  val firstElement: Int = h(0)
  h(0) = 10
  h :+= 4
  h ++= Array(5, 6)
  
  val base: BigInt = 123
  val exp: Int = 23
  val res: BigInt = BigDecimal(base).pow(exp).toBigInt

  def show(): Unit = {
    println("Byte: " + a)
    println("Short: " + b)
    println("Int: " + c)
    println("Long: " + d)
    println("Float: " + e)
    println("Double: " + g)
    println("Element: " + h(0))
    println("getClass of element: " + h(0).getClass)
    println("Mutated Array: " + h.mkString(", "))
    println("BigInt: " + res)
  }
}