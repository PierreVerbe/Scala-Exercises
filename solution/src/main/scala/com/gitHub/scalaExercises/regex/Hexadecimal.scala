package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object Hexadecimal extends App {

  /*
  Hexadecimal number : Use a regex to know if the word is an hexadecimal number
  ex : #a1a1a1
   */

  //Not an hexadecimal number
  println("Is abcdefghijklmnop an hexadecimal number ? " + isHexadecimalNumber("abcdefghijklmnop"))
  println("Is #z1a1a1 an hexadecimal number ? " + isHexadecimalNumber("#z1a1a1"))

  //Is an hexadecimal number
  println("Is #123 an hexadecimal number ? " + isHexadecimalNumber("#123"))
  println("Is 123 an hexadecimal number ? " + isHexadecimalNumber("123"))
  println("Is #a1a1a1 an hexadecimal number ? " + isHexadecimalNumber("#a1a1a1"))
  println("Is a1a1a1 an hexadecimal number ? " + isHexadecimalNumber("a1a1a1"))

  def isHexadecimalNumber(hexa: String): Boolean = {
    val pattern = new Regex("^#?([a-f0-9]{6}|[a-f0-9]{3})$")
    pattern.unapplySeq(hexa).isDefined
  }

}
