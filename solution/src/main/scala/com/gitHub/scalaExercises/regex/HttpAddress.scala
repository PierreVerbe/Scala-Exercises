package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object HttpAddress extends App {

  /*
  Http Address : Use a regex to know if the word is an http Address
  ex : https://www.youtube.com/
   */

  //Not an http Address
  println("Is abcdefghijklmnop an http Address ? " + isHttpAddress("abcdefghijklmnop"))

  //Is an http Address
  println("Is https://www.youtube.com/ an http Address ? " + isHttpAddress("https://www.youtube.com/"))
  println("Is http://www.youtube.com/ an http Address ? " + isHttpAddress("http://www.youtube.com/"))
  println("Is www.youtube.com an http Address ? " + isHttpAddress("www.youtube.com"))

  def isHttpAddress(link: String): Boolean = {
    val pattern = new Regex("^(https?://)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$")
    pattern.unapplySeq(link).isDefined
  }

}
