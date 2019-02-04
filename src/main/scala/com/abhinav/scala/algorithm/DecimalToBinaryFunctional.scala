package com.abhinav.scala.algorithm

object DecimalToBinaryFunctional {
  def main(args: Array[String]): Unit = {
    val actual = convertToBinary(183)
    println(actual)

    val expected = 183.toBinaryString
    println(expected)

    assert(expected == actual)
  }

  def convertToBinary(num: Int): String = {
    val divByTwo: Iterator[Int] = Iterator.iterate(num)(_ / 2)
    val binaryList: Iterator[Int] = divByTwo
      .takeWhile(_ > 0)
      .map(_ % 2)
    binaryList.mkString.reverse
  }
}
