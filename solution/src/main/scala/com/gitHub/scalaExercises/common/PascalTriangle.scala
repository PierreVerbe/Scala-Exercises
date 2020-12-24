package com.gitHub.scalaExercises.common

object PascalTriangle extends App {

  /*
 Fibonacci series : Next number is the sum of previous two numbers
 ex : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */

  //Fibonacci of 1
  //println("F1 equals ? " + fibonacciSeries(1)) //equals 1

  //Fibonacci of 7
  //println("F7 equals ? " + fibonacciSeries(7)) //equals 13


  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

}
