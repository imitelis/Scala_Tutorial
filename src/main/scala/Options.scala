object Options {
  def main(args: Array[String]): Unit = {
    // Define some Option instances
    val someValue: Option[Int] = Some(42)
    val noneValue: Option[Int] = None

    // Print the options
    println("Some value: " + someValue)
    println("None value: " + noneValue)

    // Option.getOrElse: Returns the value of the option if it exists, otherwise returns a default value
    val valueOrDefault1: Int = someValue.getOrElse(-1)
    val valueOrDefault2: Int = noneValue.getOrElse(-1)
    println("Value or default (someValue): " + valueOrDefault1)
    println("Value or default (noneValue): " + valueOrDefault2)

    // Option.map: Applies a function to the value inside the option if it exists
    val mappedValue1: Option[Int] = someValue.map(_ * 2)
    val mappedValue2: Option[Int] = noneValue.map(_ * 2)
    println("Mapped value (someValue): " + mappedValue1)
    println("Mapped value (noneValue): " + mappedValue2)

    // Option.flatMap: Applies a function to the value inside the option if it exists, and flattens the result
    val flatMappedValue1: Option[Int] = someValue.flatMap(x => Some(x * 2))
    val flatMappedValue2: Option[Int] = noneValue.flatMap(x => Some(x * 2))
    println("FlatMapped value (someValue): " + flatMappedValue1)
    println("FlatMapped value (noneValue): " + flatMappedValue2)

    // Option.filter: Filters the option if it exists, based on a predicate
    val filteredValue1: Option[Int] = someValue.filter(_ > 40)
    val filteredValue2: Option[Int] = noneValue.filter(_ > 40)
    println("Filtered value (someValue): " + filteredValue1)
    println("Filtered value (noneValue): " + filteredValue2)
  }
}
