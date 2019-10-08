package Scala.Exercices

import org.scalatest.{FunSuite, Matchers}

class AnagramTest extends FunSuite with Matchers {

  test("Silence ans Listen should return false because of the length of the world") {
    Anagram.isAnagram("Silence", "Listen") shouldBe false
  }

  test("Silent ans Listan should return false because of a typo on the 2nd word") {
    Anagram.isAnagram("Silent", "Listan") shouldBe false
  }

  test("Silent ans Listen should return true") {
    Anagram.isAnagram("Silent", "Listen") shouldBe true
  }

}