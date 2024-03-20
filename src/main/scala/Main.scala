// Main.scala
object Main {
  import Other._
  import Another._
  import Types._
  import Strings._
  import MapOperations._
  import LazyValue._

  @main def main(): Unit = {
    println("Hello world!")
    println(msg)
    Other.main()
    Another.main()
    Types.show()
    Strings.play_string(Array("new", "other", "hiya"))
    MapOperations.main()
    LazyValue.showme(Array("my", "passing"))
  }

  def msg = "I was compiled by Scala 3. :)"
}
