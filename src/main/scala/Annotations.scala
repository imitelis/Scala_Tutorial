// Define a simple annotation
class Author(name: String, year: Int) extends scala.annotation.StaticAnnotation

// Annotate a class with the Author annotation
@Author(name = "John Doe", year = 2022)
class MyClass {
  // Annotate a method with the Author annotation
  @Author(name = "Jane Smith", year = 2023)
  def myMethod(): Unit = {
    println("Hello, world!")
  }
}

object Annotations {
  val obj = new MyClass

  val classAnnotation = obj.getClass.getAnnotation(classOf[Author])
  println(s"Class author: ${classAnnotation.name}, year: ${classAnnotation.year}")

  val methodAnnotation = classOf[MyClass].getMethod("myMethod").getAnnotation(classOf[Author])
  println(s"Method author: ${methodAnnotation.name}, year: ${methodAnnotation.year}")
}