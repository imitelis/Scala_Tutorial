// Strings.scala
object Strings {
  def reverseString(input: String): String = {
    input.reverse
  }

  def toUpperCase(input: String): String = {
    input.toUpperCase
  }

  def concatenateStrings(str1: String, str2: String): String = {
    str1 + str2
  }

  def countOccurrences(input: String, char: Char): Int = {
    input.count(_ == char)
  }

  def replaceSubstring(input: String, target: String, replacement: String): String = {
    input.replaceAll(target, replacement)
  }

  def play_string(args: Array[String]): Unit = {
    val str = "Scala is awesome!"

    println("Original: " + str)
    println("Reversed: " + reverseString(str))
    println("Uppercase: " + toUpperCase(str))
    println("Concatenated: " + concatenateStrings(str, " It really is!"))
    println("Occurrences of 'a': " + countOccurrences(str, 'a'))
    println("Replacement: " + replaceSubstring(str, "awesome", "amazing"))
    args.foreach {
        arg => println(reverseString(arg))
    }
  }
}

