// Functions.scala
object Functions {
  // Function definition
  val add: (Int, Int) => Int = (x, y) => x + y
  def subtract(x: Int, y: Int): Int = x - y
  val multiply: Int => Int => Int = x => y => x * y

  // Higher-order function
  def applyOperation(x: Int, y: Int, operation: (Int, Int) => Int): Int =
    operation(x, y)

  // Partial application
  val addTen: Int => Int = add(_, 10)

  // Currying function
  val multiplyCurried: Int => Int => Int = multiply

  // Function composition
  def square(x: Int): Int = x * x

  val squareThenAddOne: Int => Int = square andThen (_ + 1) // square _ andThen (_ + 1) (deprecated)

  // Anonymous function example
  val divide: (Int, Int) => Int = (x, y) => {
    require(y != 0, "Divisor must not be zero")
    x / y
  }

  def main(args: Array[String]): Unit = {
    // Calling functions
    println(add(3, 4)) // Output: 7
    println(subtract(10, 5)) // Output: 5
    println(multiply(2)(3)) // Output: 6

    // Higher-order functions
    println(applyOperation(5, 3, add)) // Output: 8

    // Partial application
    println(addTen(5)) // Output: 15

    // Currying
    val multiplyByThree: Int => Int = multiplyCurried(3)
    println(multiplyByThree(4)) // Output: 12

    // Function composition
    println(squareThenAddOne(3)) // Output: 10

    // Anonymous function
    println(divide(10, 2)) // Output: 5
    // println(divide(10, 0)) // Throws an IllegalArgumentException
  }
}
