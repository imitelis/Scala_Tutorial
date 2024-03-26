// Math.scala

object Maths {
  val Pi: Double = scala.math.Pi
  val E: Double = scala.math.E

  def square(x: Double): Double = x * x
  def cube(x: Double): Double = x * x * x

  def sin(degrees: Double): Double = scala.math.sin(math.toRadians(degrees))
  def cos(degrees: Double): Double = scala.math.cos(math.toRadians(degrees))
  def tan(degrees: Double): Double = scala.math.tan(math.toRadians(degrees))

  def exp(x: Double): Double = scala.math.exp(x)
  def log(x: Double): Double = scala.math.log(x)
  def log10(x: Double): Double = scala.math.log10(x)

  def pow(base: Double, exponent: Double): Double = scala.math.pow(base, exponent)
  def sqrt(x: Double): Double = scala.math.sqrt(x)
  def cbrt(x: Double): Double = scala.math.cbrt(x)

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  def abs(x: Double): Double = scala.math.abs(x)
  def round(x: Double): Long = scala.math.round(x)
  def ceil(x: Double): Double = scala.math.ceil(x)
  def floor(x: Double): Double = scala.math.floor(x)
  def random(): Double = scala.util.Random.nextDouble()
  
  def gcd(a: Int, b: Int): Int = scala.math.abs(if (b == 0) a else gcd(b, a % b))
  def lcm(a: Int, b: Int): Int = scala.math.abs((a * b) / gcd(a, b))

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to scala.math.sqrt(n).toInt).exists(x => n % x == 0)
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
}
