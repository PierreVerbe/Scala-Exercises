package com.gitHub.scalaExercises.common

import scala.math.abs

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

  def smallestInterval(array: Array[Int]): Int = {
    if (array.distinct.length == array.length) {
      val crossList = array.flatMap(x => array.map(y => (x, y))) // for { x <- array; y <- array } yield (x, y)
      val intervals = crossList.filter(x => x._1 != x._2)
        .map(x => abs(x._1 - x._2))

      intervals.min
    }
    else 0
  }

}
