// Sets.scala
object Sets {
  def main(args: Array[String]): Unit = {
    // Creating a set of integers
    val numbers = Set(3, 1, 4, 1, 5, 9, 2, 6, 5)

    // Accessing elements
    println("Set elements:")
    numbers.foreach(println) // Output: 1, 2, 3, 4, 5, 6, 9

    // Adding elements
    val modifiedNumbers = numbers + 10
    println("\nModified set after adding an element:")
    modifiedNumbers.foreach(println) // Output: 1, 2, 3, 4, 5, 6, 9, 10

    // Removing elements
    val filteredNumbers = numbers.filter(_ != 1)
    println("\nSet after removing an element:")
    filteredNumbers.foreach(println) // Output: 2, 3, 4, 5, 6, 9

    // Set operations
    val set1 = Set(1, 2, 3, 4)
    val set2 = Set(3, 4, 5, 6)

    println("\nSet operations:")
    println("Union: " + (set1.union(set2))) // Output: Set(1, 2, 3, 4, 5, 6)
    println("Intersection: " + (set1.intersect(set2))) // Output: Set(3, 4)
    println("Difference: " + (set1.diff(set2))) // Output: Set(1, 2)

    // Set methods
    println("\nSet methods:")
    println("Size of set: " + numbers.size) // Output: 7
    println("Check if set contains 5: " + numbers.contains(5)) // Output: true
  }
}
