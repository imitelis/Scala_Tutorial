import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Success, Failure}
import java.util.concurrent.Executors

object Concurrencies {
  // Define an execution context for running futures
  implicit val ec: ExecutionContext = ExecutionContext.fromExecutor(Executors.newCachedThreadPool())

  // Function to simulate an asynchronous task
  def simulateTask(id: Int): Future[String] = Future {
    Thread.sleep(1000) // Simulate some computation
    s"Task $id completed"
  }

  def main(args: Array[String]): Unit = {
    // Create multiple futures concurrently
    val futures = (1 to 5).map(id => simulateTask(id))

    // Handle completion of each future
    val allFutures = Future.sequence(futures)
    allFutures.onComplete {
      case Success(results) =>
        println("All tasks completed successfully:")
        results.foreach(println)
      case Failure(exception) =>
        println(s"An error occurred: ${exception.getMessage}")
    }

    // Block the main thread until all futures complete
    Thread.sleep(6000) // Wait for 6 seconds
  }
}