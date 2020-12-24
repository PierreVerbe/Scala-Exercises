package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object PhoneNumber extends App {

  /*
  Phone Number : Use a regex to know if the word is a phone number
  ex : +33123456789
   */

  //Not an phone number
  println("Is 000 a phone number ? " + isPhoneNumber("000"))

  //Is an phone number
  println("Is +33123456789 a phone number ? " + isPhoneNumber("+33123456789")) // true
  println("Is 0123456789 a phone number ? " + isPhoneNumber("0123456789")) // true

  def isPhoneNumber(number: String): Boolean = {
    val pattern = new Regex("(0|\\+33)[1-9]( *[0-9]{2}){4}")
    pattern.unapplySeq(number).isDefined
  }

}
