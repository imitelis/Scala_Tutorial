import scala.io.StdIn
import scala.math.BigDecimal

object IO {
  def readInt(prompt: String = "Enter an integer: "): Int = {
    print(prompt)
    StdIn.readInt()
  }

  def readDouble(prompt: String = "Enter a double: "): Double = {
    print(prompt)
    StdIn.readDouble()
  }

  def readString(prompt: String = "Enter a string: "): String = {
    print(prompt)
    StdIn.readLine()
  }

  def readBigDecimal(prompt: String = "Enter a BigDecimal: "): BigDecimal = {
    print(prompt)
    BigDecimal(readString())
  }

  def printInt(value: Int): Unit = {
    println(value)
  }

  def printDouble(value: Double): Unit = {
    println(value)
  }

  def printString(value: String): Unit = {
    println(value)
  }

  def printBigDecimal(value: BigDecimal): Unit = {
    println(value)
  }
}
