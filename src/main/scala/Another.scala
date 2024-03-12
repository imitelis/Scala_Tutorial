// Another.scala
object Another {
  val x: Int = 10
  val y: Double = 3.14

  val isTrue: Boolean = true

  val ch: Char = 'A'

  val str: String = "Hello, Scala!"

  val arr: Array[Int] = Array(1, 2, 3)
  val list: List[String] = List("Scala", "Java", "Python")
  val set: Set[Int] = Set(1, 2, 3)
  val map: Map[String, Int] = Map("one" -> 1, "two" -> 2)
  
  def main(): Unit = {
    print(x, y, isTrue)
    println(arr)
    println(arr.mkString(", "))

    println(list)
    println(list.mkString(", "))
  }
}
