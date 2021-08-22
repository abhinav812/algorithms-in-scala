package com.abhinav.scala.algorithm

object Factorial {
  def main(args: Array[String]): Unit = {
    println(fact(10))
  }

  /**
    * fact(5) = 5 * 4 * 3 * 2 * 1
    */
  def fact(n: Int): BigDecimal =
    if (n == 1) BigDecimal.valueOf(1)
    else {
      (1 to n)
        .map(BigDecimal.valueOf(_))
        .foldLeft(BigDecimal.valueOf(1)) {
          (fact, reminder) => fact * reminder
        }
    }

}
