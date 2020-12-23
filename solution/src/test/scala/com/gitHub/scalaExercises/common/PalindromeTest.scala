package com.gitHub.scalaExercises.common

import org.scalatest.{FunSuite, Matchers}

class PalindromeTest extends FunSuite with Matchers {

  test("ThisThing should return false because it's not a palindrome") {
    Palindrome.isPalindrome("ThisThing") shouldBe false
  }

  test("Kayak should return true because it's a palindrome") {
    Palindrome.isPalindrome("Kayak") shouldBe true
  }

}