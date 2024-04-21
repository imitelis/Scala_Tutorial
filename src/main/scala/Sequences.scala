object Sequences {
  def main(args: Array[String]): Unit = {
    // Define a sequence of numbers
    val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)

    // Print the sequence
    println("Original Sequence: " + numbers)

    // Map: Applies a function to each element of the sequence
    val squaredNumbers: Seq[Int] = numbers.map(x => x * x)
    println("Squared Numbers: " + squaredNumbers)

    // Filter: Selects elements from the sequence that satisfy a predicate
    val evenNumbers: Seq[Int] = numbers.filter(x => x % 2 == 0)
    println("Even Numbers: " + evenNumbers)

    // Reduce: Reduces the elements of the sequence to a single value
    val sum: Int = numbers.reduce((x, y) => x + y)
    println("Sum of Numbers: " + sum)

    // Fold: Combines the elements of the sequence with a binary function
    val product: Int = numbers.fold(1)((x, y) => x * y)
    println("Product of Numbers: " + product)

    // Zip: Zips two sequences together into a single sequence of pairs
    val letters: Seq[Char] = Seq('a', 'b', 'c', 'd', 'e')
    val zippedSequence: Seq[(Int, Char)] = numbers.zip(letters)
    println("Zipped Sequence: " + zippedSequence)

    // Slice: Returns a subsequence of the original sequence
    val subSequence: Seq[Int] = numbers.slice(1, 4)
    println("Subsequence: " + subSequence)

    // Reverse: Reverses the order of elements in the sequence
    val reversedSequence: Seq[Int] = numbers.reverse
    println("Reversed Sequence: " + reversedSequence)
  }
}
