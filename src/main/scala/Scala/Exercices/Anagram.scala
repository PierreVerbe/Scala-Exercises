package Scala.Exercices

object Anagram extends App {

  /*
  Anagram : 2 words which contain the same letters
  ex : Listen and Silent
   */

  //Not an anagram
  println("Listen and Silent are anagram ? " + isAnagram("Listen", "Silant"))

  //An anagram
  println("Listen and Silent are anagram ? " + isAnagram("Listen", "Silent"))

  def isAnagram(word: String, anagram: String): Boolean = {
    def idAnagramRecursive(wordArray: Array[Char], anagramArray: Array[Char], current: Int): Boolean = {
      if (current >= wordArray.length) true
      else if (wordArray(current) != anagramArray(current)) false
      else idAnagramRecursive(wordArray, anagramArray, current + 1)
    }

    if (word.length != anagram.length) return false
    else {
      val wordArraySort = word.toLowerCase.toCharArray.sortWith(_ < _)
      val anagramArraySort = anagram.toLowerCase.toCharArray.sortWith(_ < _)

      val currentPosition = 0
      idAnagramRecursive(wordArraySort, anagramArraySort, currentPosition)
    }
  }

}