// LazyValue.scala 
import scala.math.pow

object LazyValue {
    // Define a lazy value
    lazy val lazyValue: Int = {
        println("Initializing lazyValue")  // Print a message to indicate lazy value initialization
        42  // Return the value
    }

    def showme(args: Array[String]): Unit = {
        args.foreach(println)
        // Access the lazy value
        println("Accessing lazyValue: " + lazyValue)  // Output: Initializing lazyValue, Accessing lazyValue: 42
        println("Accessing lazyValue again: " + lazyValue)  // Output: Accessing lazyValue again: 42
    }
}