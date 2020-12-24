package com.gitHub.scalaExercises.common

object FibonacciSeries extends App {

  /*
  Fibonacci series : Next number is the sum of previous two numbers
  ex : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
   */

  //Fibonacci of 1
  println("F1 equals ? " + fibonacciSeries(1)) //Equals 1

  //Fibonacci of 7
  println("F7 equals ? " + fibonacciSeries(7)) //Equals 13

  def fibonacciSeries(n: Int): Int = ???

}
