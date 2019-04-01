package com.abhinav.scala.algorithm

import Factorial.fact

object Exponential {
  def main(args: Array[String]): Unit = {
    val input: scala.collection.immutable.List[Double] = scala.collection.immutable.List(20.0000, 5.0000, 0.5000, -0.5000)

    input.foreach(n => {
      val result: BigDecimal = exp(n, 10)
      val numberFormat = new java.text.DecimalFormat("0.0000")
      println(numberFormat.format(result))
    })
  }

  /**
    * e&#94;x = 1 + x + x**2/2! + x**3/3! + x**4/4! + ......
    *
    */
  def exp(x: Double, itration: Int): BigDecimal = {
    val reminder: BigDecimal =
      (2 until itration)
        .map(n => Math.pow(x, n) / fact(n))
        .sum

    1 + x + reminder
  }

}
