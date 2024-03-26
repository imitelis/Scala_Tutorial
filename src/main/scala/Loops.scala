// Loops.scala
object Loops {
    def main(): Unit = {
    // For loop
    println("For loop:")
    for (i <- 1 to 5) {
      println(i)
    }

    // While loop
    println("\nWhile loop:")
    var j = 1
    while (j <= 5) {
      println(j)
      j += 1
    }

    // Do-while loop (deprecated)
    /*
    println("\nDo-while loop:")
    var k = 1
    do {
      println(k)
      k += 1
    } while (k <= 5)
    */
  }
}