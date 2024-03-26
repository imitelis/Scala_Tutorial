// Underscores.scala

object Underscores {
  // Placeholder syntax
  def placeholderSyntaxExample(): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val doubledList = list.map(_ * 2) // Using underscore as a placeholder for lambda parameters
    println(doubledList) // Output: List(2, 4, 6, 8, 10)
  }

  // Anonymous functions
  def anonymousFunctionsExample(): Unit = {
    val addOne: Int => Int = _ + 1 // Anonymous function using underscore
    println(addOne(5)) // Output: 6
  }

  // Ignoring parameters
  def ignoringParametersExample(): Unit = {
    val (_, _, result) = (1, 2, 3) // Ignoring elements of a tuple using underscores
    println(result) // Output: 3
  }

  // Wildcard imports
  def wildcardImportsExample(): Unit = {
    import scala.collection._ // Wildcard import to import all members of the package
    // Now access members of scala.collection
  }

  // Partial functions
  def partialFunctionsExample(): Unit = {
    val divide: PartialFunction[Int, Int] = {
      case x if x != 0 => 10 / x
    }
    println(divide.isDefinedAt(5)) // Output: true
    println(divide.isDefinedAt(0)) // Output: false
    println(divide(5)) // Output: 2
  }

  // Placeholder syntax with multiple underscores
  def multipleUnderscoresExample(): Unit = {
    val tupleList = List((1, "one"), (2, "two"), (3, "three"))
    val mappedList = tupleList.map(_._2) // Using underscores to access tuple elements
    println(mappedList) // Output: List("one", "two", "three")
  }

  // Existential types
  def existentialTypesExample(): Unit = {
    val list: List[? <: Any] = List(1, "two", 3.0) // Existential type with wildcard underscore
    // Favours using ? instead of _ (deprecated)
    println(list) // Output: List(1, two, 3.0)
  }

  // Type inference
  def typeInferenceExample(): Unit = {
    val add: (Int, Int) => Int = _ + _ // Type inference with underscores in function definition
    println(add(3, 4)) // Output: 7
  }

  // Placeholder for unused parameters in higher-order functions
  def higherOrderFunctionsExample(): Unit = {
    def applyFunctionToIntegers(numbers: Seq[Int], f: Int => Unit): Unit = {
      numbers.foreach(f) // Using underscore as a placeholder for unused parameter
    }

    applyFunctionToIntegers(List(1, 2, 3), println) // Output: 1 2 3
  }

  // Operator notation (deprecated)
  /*
  def operatorNotationExample(): Unit = {
    val result = 10 + _ // Using underscore in operator notation
    println(result(5)) // Output: 15
  }
  */

  // Function literals
  def functionLiteralsExample(): Unit = {
    val isEven: Int => Boolean = _ % 2 == 0 // Function literal using underscore
    println(isEven(4)) // Output: true
  }

  // Companion object methods
  def companionObjectMethodsExample(): Unit = {
    case class Person(name: String)
    object Person {
      def apply(): Person = Person("John") // Using underscore to reference apply method
    }

    val john = Person() // Output: Person("John")
    println(john)
  }

  def main(args: Array[String]): Unit = {
    placeholderSyntaxExample()
    anonymousFunctionsExample()
    ignoringParametersExample()
    wildcardImportsExample()
    partialFunctionsExample()
    multipleUnderscoresExample()
    existentialTypesExample()
    typeInferenceExample()
    higherOrderFunctionsExample()
    // operatorNotationExample()
    functionLiteralsExample()
    companionObjectMethodsExample()
  }
}
