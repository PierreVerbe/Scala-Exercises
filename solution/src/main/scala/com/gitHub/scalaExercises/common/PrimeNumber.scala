package com.gitHub.scalaExercises.common

object PrimeNumber extends App {

  /*
  Prime number : A prime number is a number that can only be divided by 1 and itself.
  ex : 9 is divisible by 1, 3, 9 -> it's not a prime number
       7 is divisible by 1, 7 -> it's a prime number
   */

  //Not a prime number
  println("9 is a prime number ? " + isPrimeNumber(9))

  //A prime number
  println("7 is a prime number ? " + isPrimeNumber(7))

  def isPrimeNumber(number: Int): Boolean = {
    def isPrimeNumberRecursive(divisor: Int): Boolean = {
      if (divisor <= 1) true
      else number % divisor != 0 && isPrimeNumberRecursive(divisor - 1)
    }

    isPrimeNumberRecursive(number / 2)
  }

}
