// Objects.scala

class Person(name: String, age: Int) {
  val fullName: String = name
  val personAge: Int = age

  def printDetails(): Unit = {
    println(s"Name: $fullName, Age: $personAge")
  }
}

object Person {
  def apply(name: String): Person = new Person(name, 30)
}

class Employee(name: String, age: Int, val employeeId: String, val department: String) extends Person(name, age) {
  override def printDetails(): Unit = {
    super.printDetails()
    println(s"Employee ID: $employeeId, Department: $department")
  }
}

class Student(name: String, age: Int, val studentId: String, val major: String) extends Person(name, age) {
    override def printDetails(): Unit = {
    super.printDetails()
    println(s"Student ID: $studentId, Major: $major")
  }
}

object Objects {
  def main(args: Array[String]): Unit = {
    val person1 = Person("Alice")
    person1.printDetails()
    val person2 = new Person("Bob", 25)
    person2.printDetails()
  }
}
