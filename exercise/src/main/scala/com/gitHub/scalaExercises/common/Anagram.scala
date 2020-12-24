package com.gitHub.scalaExercises.common

object Anagram extends App {

  /*
  Anagram : 2 words which contain the same letters
  ex : Listen and Silent
   */

  //Not an anagram
  println("Listen and Silent are anagram ? " + isAnagram("Listen", "Silant"))

  //An anagram
  println("Listen and Silent are anagram ? " + isAnagram("Listen", "Silent"))

  def isAnagram(word: String, anagram: String): Boolean = ???

}
