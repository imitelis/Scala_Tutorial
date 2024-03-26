// src/test/scala/Testing.scala
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MyTestClass {
  def add(a: Int, b: Int): Int = a + b
}

object Testing extends AnyFlatSpec with Matchers {
  val myClass = new MyTestClass()

  "MyClass" should "correctly add two numbers" in {
    val result = myClass.add(2, 3)
    result shouldEqual 5
  }

  it should "return the same number when adding zero" in {
    val result = myClass.add(5, 0)
    result shouldEqual 5
  }
}
