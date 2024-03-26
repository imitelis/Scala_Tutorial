// Define a simple annotation
class Author(val name: String, val year: Int) extends scala.annotation.StaticAnnotation

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

  // class-level annotation
  val classAnnotation: Option[Author] =
    obj.getClass.getAnnotations
      .find(_.annotationType() == classOf[Author])
      .map(_.asInstanceOf[Author])

  // method-level annotation
  val methodAnnotation: Option[Author] =
    classOf[MyClass].getMethod("myMethod").getAnnotations
      .find(_.annotationType() == classOf[Author])
      .map(_.asInstanceOf[Author])
}
