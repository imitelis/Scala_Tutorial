object HighFunctions {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)

    // map: Applies a function to each element of the list
    val squaredNumbers = numbers.map(x => x * x)
    println("Squared numbers: " + squaredNumbers)

    // reduce: Reduces the elements of the list to a single value
    val sum = numbers.reduce((x, y) => x + y)
    println("Sum of numbers: " + sum)

    // filter: Selects elements from the list that satisfy a predicate
    val evenNumbers = numbers.filter(x => x % 2 == 0)
    println("Even numbers: " + evenNumbers)

    // foreach: Executes a function for each element of the list
    numbers.foreach(x => println("Number: " + x))

    // forall: Checks if every element of the list satisfies a predicate
    val allGreaterThanZero = numbers.forall(x => x > 0)
    println("All numbers greater than zero? " + allGreaterThanZero)
  }
}
