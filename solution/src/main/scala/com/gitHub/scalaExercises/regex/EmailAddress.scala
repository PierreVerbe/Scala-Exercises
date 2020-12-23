package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object EmailAddress extends App {

  //Not an anagram
  println("Emaial ? " + isEmailAddress("test@gmail.com"))

  def isEmailAddress(email: String): Boolean = {
    val pattern = new Regex("(\\w+)@([\\w\\.]+)")
    pattern.unapplySeq(email).isDefined
  }

}
