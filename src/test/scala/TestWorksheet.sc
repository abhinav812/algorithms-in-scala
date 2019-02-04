println("Hello")

(1 to 10).toList

val rand: Iterator[Double] = Iterator.continually(Math.random)
rand.take(5).toList


val plusOne = Iterator.iterate(6)(_ + 1)
plusOne.take(10).toList

