package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object EmailAddress extends App {

  /*
  Email address : Use a regex to know if the word is an email address
  ex : first.lastname@gmail.com
   */

  //Not an email address
  println("Is Thursday an email address ? " + isEmailAddress("Thursday"))

  //Is an email address
  println("Is first.lastname@gmail.com an email address ? " + isEmailAddress("first.lastname@gmail.com"))
  println("Is first.last.name@gmail.com an email address ? " + isEmailAddress("first.last.name@gmail.com"))

  def isEmailAddress(email: String): Boolean = {
    val pattern = new Regex("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$")
    pattern.unapplySeq(email).isDefined
  }

}
