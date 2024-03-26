// Matchs.scala
object Matchs {
  def main(args: Array[String]): Unit = {
    // Matching expressions
    val dayOfWeek = 3 // Wednesday
    
    val dayString = dayOfWeek match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday"
      case 7 => "Sunday"
      case _ => "Invalid day" // Default case
    }
    
    println(s"Today is $dayString")
    
    // Matching with conditions
    val result = "apple"
    val fruitString = result match {
      case "apple" if dayOfWeek < 4 => "Apple in the first half of the week"
      case "apple" if dayOfWeek >= 4 => "Apple in the second half of the week"
      case "banana" => "Banana"
      case _ => "Unknown fruit"
    }
    
    println(fruitString)

    // Case classes
    case class Person(name: String, age: Int)

    val person = Person("Alice", 30)
    person match {
    case Person(name, age) => println(s"Name: $name, Age: $age")
    }

    // Variable binding
    val varResult = (1, 2, 3)
    varResult match {
      case (a, b, c) => println(s"Values: $a, $b, $c")
    }

    // Guards
    val x = 10
    val y = 20
    (x, y) match {
      case (a, b) if a == b => println("Equal")
      case (a, b) if a < b => println("Less than")
      case _ => println("Greater than")
    }

    // Sealed trait
    sealed trait Fruit
    case class Apple() extends Fruit
    case class Banana() extends Fruit

    val fruit: Fruit = Apple()
    fruit match {
      case Apple() => println("It's an apple")
      case Banana() => println("It's a banana")
    }
  }
}
