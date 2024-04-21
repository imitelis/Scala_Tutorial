import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Futures {
  def main(args: Array[String]): Unit = {
    // Define a future that completes after a delay
    val futureResult: Future[Int] = Future {
      Thread.sleep(1000) // Simulate a long-running computation
      42 // Return a result
    }

    // Print a message before waiting for the future to complete
    println("Waiting for the future to complete...")

    // Use Await to block and wait for the future to complete
    val result: Int = Await.result(futureResult, 2.seconds)

    // Print the result after the future completes
    println("Future completed with result: " + result)
  }
}
