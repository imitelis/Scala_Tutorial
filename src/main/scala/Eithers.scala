object Eithers {
  def main(args: Array[String]): Unit = {
    // Define a function that performs division, returning Either
    def divide(x: Int, y: Int): Either[String, Double] = {
      if (y != 0) Right(x.toDouble / y) // Success case
      else Left("Division by zero")      // Failure case
    }

    // Example usage of the divide function
    val result1 = divide(10, 2)   // Result: Right(5.0)
    val result2 = divide(10, 0)   // Result: Left("Division by zero")

    // Pattern matching to handle Either results
    result1 match {
      case Right(value) => println(s"Result: $value")
      case Left(error) => println(s"Error: $error")
    }

    // Using map, flatMap, and fold to work with Either
    val processedResult = result1.map(_ * 2)       // Multiply the result by 2
                                  .flatMap(x => Right(x / 2)) // Divide the result by 2
                                  .fold(error => s"Error: $error", result => s"Processed Result: $result")

    println(processedResult)
  }
}
