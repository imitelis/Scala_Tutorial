// Define a base class
class Animal(var name: String, var age: Int) {
  def makeSound(): Unit = println("Animal makes a sound")
}

// Define a subclass that extends the base class
class Dog(name: String, age: Int, var breed: String) extends Animal(name, age) {
  override def makeSound(): Unit = println("Dog barks")
  def wagTail(): Unit = println("Dog wags tail")
}

object Inheritances {
  def main(args: Array[String]): Unit = {
    // Create an instance of the base class
    val animal = new Animal("Fido", 5)
    println("Animal: " + animal.name + ", " + animal.age)
    animal.makeSound()  // Output: Animal makes a sound

    // Create an instance of the subclass
    val dog = new Dog("Buddy", 3, "Golden Retriever")
    println("Dog: " + dog.name + ", " + dog.age + ", " + dog.breed)
    dog.makeSound()  // Output: Dog barks
    dog.wagTail()   // Output: Dog wags tail
  }
}
