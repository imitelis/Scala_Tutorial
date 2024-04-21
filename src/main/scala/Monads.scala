object Monads {
  // Define a function that returns an Option
  def divide(x: Int, y: Int): Option[Double] =
    if (y != 0) Some(x.toDouble / y) else None

  def main(args: Array[String]): Unit = {
    // Perform division and handle the result using flatMap and map
    val result: Option[Double] = divide(10, 5)
      .flatMap(a => divide(a.toInt, 2))
      .map(b => b * 10)

    // Print the result
    println("Result: " + result)  // Output: Result: Some(10.0)

    // Perform division by zero and handle the result
    val resultWithError: Option[Double] = divide(10, 0)
      .flatMap(a => divide(a.toInt, 2))
      .map(b => b * 10)

    // Print the result with error
    println("Result with error: " + resultWithError)  // Output: Result with error: None
  }
}
