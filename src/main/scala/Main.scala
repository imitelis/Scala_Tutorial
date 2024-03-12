// Main.scala
object Main {
  import Other._
  import Another._

  @main def main(): Unit = {
    println("Hello world!")
    println(msg)
    Other.main()
    Another.main()
  }

  def msg = "I was compiled by Scala 3. :)"
}
