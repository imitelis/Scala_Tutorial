// Maps.scala
val emptyMap: Map[String, Int] = Map.empty
val map: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3)

val defaultMap = Map("a" -> 1, "b" -> 2).withDefaultValue(-1)

object MapOperations {
  def main(): Unit = {
    val value: Int = map("two")
    val valueOption: Option[Int] = map.get("three")

    val updatedMap = map + ("four" -> 4)
    val modifiedMap = map.updated("three", 33)

    val newMap = map - "two"

    map.foreach { case (key, value) => println(s"Key: $key, Value: $value") }

    val size: Int = map.size
    val isEmpty: Boolean = map.isEmpty

    val containsKey: Boolean = map.contains("two")

    val transformedMap = map.mapValues(_ * 2)

    val mergedMap = map ++ Map("four" -> 4, "five" -> 5)

    println(defaultMap("c"))
    println(s"Value associated with 'two': $value")
    println(s"Option value associated with 'three': $valueOption")
    println(s"Updated map: $updatedMap")
    println(s"Modified map: $modifiedMap")
    println(s"New map after removal: $newMap")
    println(s"Transformed map: $transformedMap")
    println(s"Merged map: $mergedMap")
  }
}
