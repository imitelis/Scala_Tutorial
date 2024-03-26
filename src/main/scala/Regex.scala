import scala.util.matching.Regex

object RegexMatch {
  def main(args: Array[String]): Unit = {
    // Regular expression to match email addresses
    val emailRegex: Regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}".r

    // Text containing email addresses
    val text = "Please contact john.doe@example.com or jane_smith@example.co.uk for more information."

    // Find all email addresses in the text
    val emailsFound = emailRegex.findAllIn(text).toList

    // Print the found email addresses
    println("Found email addresses:")
    emailsFound.foreach(println)
  }
}
