// FunctionalProgramming.scala
object FunctionalProgramming {
  // Higher-order function: takes a function as an argument
  def applyOperation(x: Int, y: Int, operation: (Int, Int) => Int): Int =
    operation(x, y)

  // Example functions
  def add(x: Int, y: Int): Int = x + y
  def subtract(x: Int, y: Int): Int = x - y
  def multiply(x: Int, y: Int): Int = x * y

  // Immutable data structures
  val numbers = List(1, 2, 3, 4, 5)
  val doubledNumbers = numbers.map(_ * 2)

  // Function composition
  val square: Int => Int = (x: Int) => x * x
  val addOne: Int => Int = (x: Int) => x + 1
  val squareThenAddOne: Int => Int = square.andThen(addOne)

  // Currying
  val add: Int => Int => Int = (x: Int) => (y: Int) => x + y
  val addThree: Int => Int = add(3)
  val addEight: Int = add(3)(5) // Result is 8

  // Recursion
  def factorial(n: Int): Int = {
  @scala.annotation.tailrec
  def factorialHelper(acc: Int, n: Int): Int = {
    if (n <= 1) acc
    else factorialHelper(acc * n, n - 1)
  }
  
  factorialHelper(1, n)
  }

  // Option and Either
  val maybeValue: Option[Int] = Some(10)
  val result = maybeValue.map(_ * 2).getOrElse(0)

  def main(args: Array[String]): Unit = {
    val result1 = applyOperation(3, 4, add)        // result1 = 7
    val result2 = applyOperation(10, 5, subtract)  // result2 = 5
    val result3 = applyOperation(2, 3, multiply)   // result3 = 6

    println(s"Result 1: $result1")
    println(s"Result 2: $result2")
    println(s"Result 3: $result3")

    println(doubledNumbers) // Output: List(2, 4, 6, 8, 10)

    println(squareThenAddOne(3)) // Output: 10

    println(addThree(5)) // Output: 8

    println(factorial(5)) // Output: 120

    println(result) // Output: 20
  }
}
