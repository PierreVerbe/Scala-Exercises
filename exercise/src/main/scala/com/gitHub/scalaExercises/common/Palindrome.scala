package com.gitHub.scalaExercises.common

object Palindrome extends App {

  /*
  Palindrome : A word or group of words that can be read from left to right or right to left with the same meaning
  ex : kayak, bob
   */

  //Not a palindrome
  println("ThisThing is a palindrome ? " + isPalindrome("ThisThing"))

  //A Palindrome
  println("Kayak is a palindrome ? " + isPalindrome("Kayak"))

  def isPalindrome(word: String): Boolean = ???

}
