trait Animal
class Dog extends Animal
class Cat extends Animal

class AnimalShelter[T <: Animal](animals: List[T]) {
  // Some methods and operations
}

val dogShelter = new AnimalShelter[Dog](List(new Dog(), new Dog()))
val catShelter = new AnimalShelter[Cat](List(new Cat(), new Cat()))
