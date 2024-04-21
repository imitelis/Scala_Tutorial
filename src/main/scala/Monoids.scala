object Monoids {
  // Define a monoid for integers
  trait Monoid[A] {
    def zero: A                      // Identity element
    def op(a1: A, a2: A): A          // Binary operation
  }

  // Define a monoid for integers using addition
  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def zero: Int = 0
    def op(a1: Int, a2: Int): Int = a1 + a2
  }

  // Define a function to combine a list of elements using the monoid
  def combine[A](list: List[A])(implicit monoid: Monoid[A]): A =
    list.foldLeft(monoid.zero)(monoid.op)

  def main(args: Array[String]): Unit = {
    // Example usage of the integer monoid
    val numbers = List(1, 2, 3, 4, 5)
    val sum = combine(numbers)
    println("Sum of numbers: " + sum)  // Output: Sum of numbers: 15
  }
}
