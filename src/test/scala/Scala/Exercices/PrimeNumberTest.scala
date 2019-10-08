package Scala.Exercices

import org.scalatest.{FunSuite, Matchers}

class PrimeNumberTest extends FunSuite with Matchers {

  test("88 should return false because it's not a prime number") {
    PrimeNumber.isPrimeNumber(88) shouldBe false
  }

  test("43 should return true because it's a prime number") {
    PrimeNumber.isPrimeNumber(43) shouldBe true
  }

}