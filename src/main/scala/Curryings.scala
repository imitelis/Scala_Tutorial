object Curryings {
  // Define a function with multiple arguments
  def add(x: Int, y: Int): Int = x + y

  // Define a curried version of the add function
  def curriedAdd(x: Int)(y: Int): Int = x + y

  def main(args: Array[String]): Unit = {
    // Call the original add function
    val sum1 = add(3, 4)
    println("Sum (add): " + sum1)  // Output: Sum (add): 7

    // Call the curried version of the add function
    val sum2 = curriedAdd(3)(4)
    println("Sum (curriedAdd): " + sum2)  // Output: Sum (curriedAdd): 7

    // Partially apply the curriedAdd function
    val add3 = curriedAdd(3) _   // Partial application
    val sum3 = add3(4)
    println("Sum (curriedAdd partial application): " + sum3)  // Output: Sum (curriedAdd partial application): 7
  }
}
