package Scala.Exercices

object Palindrome {

  /*
  Palindrome : A word or group of words that can be read from left to right or right to left with the same meaning
  ex : kayak, bob
  */

  def isPalindrome(word: String): Boolean = {
    val wordLowerCase = word.toLowerCase
    val length = wordLowerCase.length
    var forward = 0
    var backward = length - 1

    while (backward > forward){
      val forwardChar = wordLowerCase.charAt(forward)
      val backwardChar = wordLowerCase.charAt(backward)

      if (forwardChar != backwardChar) return false

      backward -= 1
      forward += 1
    }
    println("the word " + wordLowerCase + " is a Palindrom")
    true
  }

  def isPalindrome2(word: String): Boolean = {
    val wordLowerCase = word.toLowerCase
    val length = wordLowerCase.length

    for(i <- 0 to length/2.ceil.toInt) if (wordLowerCase.charAt(i) != wordLowerCase.charAt(length-i-1)) return false

    true
  }

}

