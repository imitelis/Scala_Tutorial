// LazyValue.scala 
import scala.math.pow

object LazyValue {
    lazy val expensive: Double = {
        pow(43, 232) * 12
    }

    def showme(args: Array[String]): Unit = {
        args.foreach(println)
        println("starting...")

        println("expensive:")
        println(expensive)

        println("expensive again:")
        println(expensive)
    }
}