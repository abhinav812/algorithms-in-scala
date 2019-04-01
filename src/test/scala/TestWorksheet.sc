import scala.annotation.tailrec

println("Hello")

def fibonacci(x:Int):Int = x match {
  case 1 => 0
  case 2 => 1
  case _ => fibonacci(x - 1) + fibonacci(x - 2)
}
