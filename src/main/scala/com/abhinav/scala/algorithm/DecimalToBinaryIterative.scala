package com.abhinav.scala.algorithm

object DecimalToBinaryIterative {
  def main(args: Array[String]): Unit = {
    val expected = 183.toBinaryString
    println(expected)

    val actual1 = convertToBinary(183)
    println(actual1)

    val actual2 = convertToBinary2(183)
    println(actual2)


    assert(expected == actual1)
    assert(expected == actual2)
  }

  /*
      convertToBinary(x)

      1. stack = $EMPTY_STACK
      2. while( x > 0)
      3. push(stack, x mod 2)
      4. x = x div 2
      5 binary = popAll(stack)
     */
  def convertToBinary(n: Int): String = {
    var temp = n
    var stack: List[Int] = List.empty[Int]
    while( temp > 0) {
      stack = temp % 2 +: stack
      temp = temp / 2
    }
    stack.mkString
  }

  /*
      convertToBinary(x)

      1. binary = $EMPTY_STR
      2. while (x > 0)
      3. concat(binary, x mod 2)
      4. x = x div 2
      5. binary = reverse(binary)
      6. return binary
     */
  def convertToBinary2(n: Int): String = {
    var temp = n
    var binary = ""
    while( temp > 0) {
      binary = binary + temp % 2
      temp = temp / 2
    }
    binary.reverse
  }

}
