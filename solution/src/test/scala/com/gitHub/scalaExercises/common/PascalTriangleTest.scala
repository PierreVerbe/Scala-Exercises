package com.gitHub.scalaExercises.common

import org.scalatest.{FunSuite, Matchers}

class PascalTriangleTest extends FunSuite with Matchers {

  test("Pascal triangle of column 0 and row 3 should return 1") {
    PascalTriangle.pascal(0, 3) shouldBe 1
  }

  test("Pascal triangle of column 3 and row 5 should return 10") {
    PascalTriangle.pascal(3, 5) shouldBe 10
  }

}
