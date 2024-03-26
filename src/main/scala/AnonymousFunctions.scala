// AnonymousFunctions.scala
object AnonymousFunctions {
    val addOne: Int => Int = (x: Int) => x + 1
    val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
    val greet: () => String = () => "Hello, world!"
    val numbers = List(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map(x => x * x)

    def main(): Unit = {
        println(addOne(5)) // Output: 6
        println(add(3, 4)) // Output: 7
        println(greet()) // Output: Hello, world!
        println(squaredNumbers) // Output: List(1, 4, 9, 16, 25)        
    }
}