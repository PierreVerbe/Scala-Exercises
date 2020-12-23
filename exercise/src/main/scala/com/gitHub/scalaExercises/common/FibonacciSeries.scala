package Scala.Exercices

object FibonacciSeries extends App {

  /*
  Fibonacci series : Next number is the sum of previous two numbers
  ex : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
  */

  //Fibonacci of 1
  println("F1 equals ? " + fibonacciSeries(1)) //equals 1

  //Fibonacci of 7
  println("F7 equals ? " + fibonacciSeries(7)) //equals 13

  def fibonacciSeries(n: Int): Int = {
    if (n < 2) n
    else fibonacciSeries(n - 1) + fibonacciSeries(n - 2)
  }

  def fibonacciSeriesTailRecursive(n: Int): Int = {

    def fibonacciSeriesTailRecursiveInner(nInner: Int, n0: Int, n1: Int): Int = {
      if (nInner == 0) return n0
      else if (nInner == 1) return n1
      fibonacciSeriesTailRecursiveInner(nInner - 1, n1, n0 + n1)
    }

    fibonacciSeriesTailRecursiveInner(n, 0, 1)
  }

}