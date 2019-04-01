import scala.annotation.tailrec

println("Hello")

(1 to 10).toList

val rand: Iterator[Double] = Iterator.continually(Math.random)
rand.take(5).toList


val plusOne = Iterator.iterate(6)(_ + 1)
plusOne.take(10).toList



def fibonacci(x:Int):Int = x match {
  case 1 => 0
  case 2 => 1
  case _ => fibonacci(x - 1) + fibonacci(x - 2)
}
