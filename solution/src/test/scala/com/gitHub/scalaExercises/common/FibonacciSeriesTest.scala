package com.gitHub.scalaExercises.common

import org.scalatest.{FunSuite, Matchers}

class FibonacciSeriesTest extends FunSuite with Matchers {

  test("Fibonacci of 0 should return 0") {
    FibonacciSeries.fibonacciSeries(0) shouldBe 0
  }

  test("Fibonacci of 1 should return 1") {
    FibonacciSeries.fibonacciSeries(1) shouldBe 1
  }

  test("Fibonacci of 10 should return 55") {
    FibonacciSeries.fibonacciSeries(10) shouldBe 55
  }

}
