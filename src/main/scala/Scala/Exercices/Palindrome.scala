package Scala.Exercices

object Palindrome extends App {

  /*
  Palindrome : A word or group of words that can be read from left to right or right to left with the same meaning
  ex : kayak, bob
  */

  //Not a palindrome
  println("ThisThing is a palindrome ? " + isPalindrome("ThisThing"))

  //A Palindrome
  println("Kayak is a palindrome ? " + isPalindrome("Kayak"))

  def isPalindrome(word: String): Boolean = {
    def isPalindromeRecursive(word: String, current: Int): Boolean = {
      if (current > word.length / 2.ceil.toInt) true
      else if (word.charAt(current) != word.charAt(word.length - 1 - current)) false
      else isPalindromeRecursive(word, current + 1)
    }

    val wordLowerCase = word.toLowerCase
    val currentPosition = 0

    isPalindromeRecursive(wordLowerCase, currentPosition)
  }

}