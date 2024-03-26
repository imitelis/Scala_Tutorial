// LispInterpreter.scala
sealed trait LispValue
case class LispNumber(value: Int) extends LispValue
case class LispList(values: List[LispValue]) extends LispValue
case class LispFunction(params: List[String], body: LispValue, env: Map[String, LispValue]) extends LispValue

object LispInterpreter {
  def eval(ast: LispValue, env: Map[String, LispValue]): LispValue = ast match {
    case LispNumber(value) => LispNumber(value)
    case LispList(Nil) => LispList(Nil)
    case LispList(LispFunction(params, body, closureEnv) :: args) =>
      val newEnv = closureEnv ++ params.zip(args.map(eval(_, env)))
      eval(body, newEnv)
    case LispList(LispNumber(1) :: LispNumber(2) :: Nil) => LispNumber(3) // Example addition
    case _ => throw new IllegalArgumentException("Unsupported operation")
  }

  def main(args: Array[String]): Unit = {
    val ast = LispList(List(LispFunction(List("x", "y"), LispList(List(LispNumber(1), LispNumber(2))), Map.empty), LispNumber(3), LispNumber(4)))
    val result = eval(ast, Map.empty)
    println(result) // Output: LispNumber(3)
  }
}
