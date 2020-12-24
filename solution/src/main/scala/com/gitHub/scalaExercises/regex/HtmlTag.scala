package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object HtmlTag extends App{

  /*
  Html tag : Use a regex to know if the word is an html tag
  ex : <div>
   */

  //Not an html tag
  println("Is abcdefghijklmnop an hexadecimal number ? " + isHtmlTag("<div>"))
  println("Is #z1a1a1 an hexadecimal number ? " + isHtmlTag("#z1a1a1"))

  //Is an html tag
  println("Is #123 an hexadecimal number ? " + isHtmlTag("<div> <div/>"))
  println("Is 123 an hexadecimal number ? " + isHtmlTag("123"))
  println("Is #a1a1a1 an hexadecimal number ? " + isHtmlTag("#a1a1a1"))
  println("Is a1a1a1 an hexadecimal number ? " + isHtmlTag("a1a1a1"))

  def isHtmlTag(tag: String): Boolean = {
    val pattern = new Regex("^<([a-z]+)([^<]+)*(?:>(.*)<\\/\1>|\\s+\\/>)$")
    pattern.unapplySeq(tag).isDefined
  }

}

// not finished
