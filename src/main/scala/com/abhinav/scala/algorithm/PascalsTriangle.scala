package com.abhinav.scala.algorithm

import com.abhinav.scala.algorithm.Factorial.fact

object PascalsTriangle {
  def main(args: Array[String]): Unit = {
    val noOfLines = io.StdIn.readInt

    (0 until noOfLines).
      foreach(row => {
        val rowToPrint = (0 to row).map {
          col => pascalTriRow(row, col)
        }.mkString(" ")

        println(rowToPrint)
      })

  }

  def pascalTriRow(row: Int, col: Int): Int = {
    fact(row) / (fact(col) * fact(row - col))
  }.toInt
}
