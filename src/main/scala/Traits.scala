object Traits {
  // Define a trait with abstract methods and concrete methods
  trait Animal {
    def sound: String                 // Abstract method
    def speak(): Unit = println(sound)  // Concrete method
  }

  // Define a class that extends the Animal trait
  class Dog extends Animal {
    def sound: String = "Woof"       // Implement the abstract method
  }

  // Define another trait
  trait Hunter {
    def hunt(): Unit                  // Abstract method
  }

  // Define a class that mixes in multiple traits
  class Wolf extends Animal with Hunter {
    def sound: String = "Howl"
    def hunt(): Unit = println("The wolf is hunting...")
  }

  def main(args: Array[String]): Unit = {
    // Create instances of Dog and Wolf
    val dog = new Dog()
    val wolf = new Wolf()

    // Call methods from the Animal trait
    dog.speak()   // Output: Woof
    wolf.speak()  // Output: Howl

    // Call method from the Hunter trait
    wolf.hunt()   // Output: The wolf is hunting...
  }
}
