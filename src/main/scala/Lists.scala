// Lists.scala
object Lists {
  def main(args: Array[String]): Unit = {
    // Creating a list of integers
    val numbers = List(3, 1, 4, 1, 5, 9, 2, 6, 5)

    // Accessing elements by index
    println("Accessing elements by index:")
    println("First element: " + numbers.head)  // Output: 3
    println("Second element: " + numbers(1))    // Output: 1

    // Prepending and appending elements
    val modifiedNumbers = 0 :: numbers // Prepend
    val newNumbers = numbers :+ 10 // Append
    println("\nModified list after prepend and append:")
    println(modifiedNumbers.mkString(", ")) // Output: 0, 3, 1, 4, 1, 5, 9, 2, 6, 5
    println(newNumbers.mkString(", ")) // Output: 3, 1, 4, 1, 5, 9, 2, 6, 5, 10

    // Removing elements
    val filteredNumbers = numbers.filter(_ != 1)
    println("\nList after removing elements:")
    println(filteredNumbers.mkString(", ")) // Output: 3, 4, 5, 9, 2, 6, 5

    // Sorting the list
    val sortedNumbers = numbers.sorted
    println("\nSorted list:")
    println(sortedNumbers.mkString(", ")) // Output: 1, 1, 2, 3, 4, 5, 5, 6, 9

    // List methods
    println("\nList methods:")
    println("Length of list: " + numbers.length) // Output: 9
    println("Sum of list elements: " + numbers.sum) // Output: 36
    println("Maximum element: " + numbers.max) // Output: 9
    println("Minimum element: " + numbers.min) // Output: 1
    println("Check if list contains 5: " + numbers.contains(5)) // Output: true
  }
}
