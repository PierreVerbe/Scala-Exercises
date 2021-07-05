package com.gitHub.scalaExercises.common

object Interval extends App {

  /*
  Interval : find the smallest interval
  ex : [1, 3, 5, 52, 2, 7, 12] -> 1
   */

  // Array(0, 3, 7, 0, 12) -> 0
  println("The smallest interval is : " + smallestInterval(Array(0, 3, 7, 0, 12)))

  // Array(0, 3, 7, 2, 1, 88, 23) -> 1
  println("The smallest interval is : " + smallestInterval(Array(0, 3, 7, 2, 1, 88, 23)))

  // Array(32, 56, 7, 129, 18, 278) -> 11
  println("The smallest interval is : " + smallestInterval(Array(32, 56, 7, 129, 18, 278)))

  def smallestInterval(array: Array[Int]): Int = ???

}
