package com.gitHub.scalaExercises.regex

import org.scalatest.{FunSuite, Matchers}

class DateTest extends FunSuite with Matchers {

  test("Thursday should return false because it's not a complete date") {
    Date.isDate("Thursday") shouldBe false
  }

  test("01-01-2020 should return false because it's not the correct format") {
    Date.isDate("01-01-2020") shouldBe false
  }

  test("1 jan 2020 should return true because it's a prime number") {
    Date.isDate("1 jan 2020") shouldBe true
  }

}
