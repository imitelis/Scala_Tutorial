// Arrays.scala
import scala.util.Sorting

object Arrays {
  def main(args: Array[String]): Unit = {
    // Creating an array of integers
    val numbers = Array(3, 1, 4, 1, 5, 9, 2, 6, 5)

    // Accessing elements by index
    println("Accessing elements by index:")
    println("First element: " + numbers(0)) // Output: 3
    println("Second element: " + numbers(1)) // Output: 1

    // Updating elements by index
    numbers(0) = 10
    println("\nUpdated array:")
    println(numbers.mkString(", ")) // Output: 10, 1, 4, 1, 5, 9, 2, 6, 5

    // Iterating through array elements
    println("\nIterating through array elements:")
    numbers.foreach(println)

    // Sorting the array
    Sorting.quickSort(numbers)
    println("\nSorted array:")
    println(numbers.mkString(", ")) // Output: 1, 1, 2, 4, 5, 5, 6, 9, 10

    // Array methods
    println("\nArray methods:")
    println("Length of array: " + numbers.length) // Output: 9
    println("Sum of array elements: " + numbers.sum) // Output: 43
    println("Maximum element: " + numbers.max) // Output: 10
    println("Minimum element: " + numbers.min) // Output: 1
    println("Check if array contains 5: " + numbers.contains(5)) // Output: true
  }
}
