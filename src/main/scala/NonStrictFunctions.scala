object NonStrictFunctions {
  // Define a non-strict function using call-by-name parameter
  def nonStrictAdd(x: => Int, y: => Int): Int = {
    println("Inside nonStrictAdd")  // Print a message to indicate function invocation
    x + y  // Add the values of x and y
  }
  
  def main(args: Array[String]): Unit = {
    // Call the non-strict function with expressions
    val sum = nonStrictAdd({
      println("Calculating x")  // Print a message to indicate calculation of x
      3
    }, {
      println("Calculating y")  // Print a message to indicate calculation of y
      4
    })

    println("Sum: " + sum)  // Output: Sum: 7
  }
}
