package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object Date extends App {

  /*
  Date : Use a regex to know if the word is a date
  ex : 01 jan 2020
   */

  //Not a date
  println("Is Thursday a date ? " + isDate("Thursday"))

  //Is a date
  println("Is 10 jan 2020 a date ? " + isDate("10 jan 2020"))
  println("Is 10 jan 2020 a date ? " + isDate("1 jan 2020"))

  def isDate(date: String): Boolean = {
    val pattern = new Regex("\\b\\d\\d? \\w\\w\\w \\d\\d\\d\\d\\b")
    pattern.unapplySeq(date).isDefined
  }

}
