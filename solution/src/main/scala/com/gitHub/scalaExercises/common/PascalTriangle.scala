package com.gitHub.scalaExercises.common

object PascalTriangle extends App {

  /*
  Pascal triangle : Is a presentation of binomial coefficients in a triangle
  ex :       1
            1, 1
           1, 2, 1
          1, 3, 3, 1
         1, 4, 6, 4, 1
        1, 5, 10, 10, 5, 1
   */

  //Pascal triangle of column 0 & row 3
  println("Pascal triangle of c = 0 & r = 3 ? " + pascal(0, 3)) //Equals 1

  //Pascal triangle of column 7 & row 3
  println("Pascal triangle of c = 4 & r = 5 ? " + pascal(3, 5)) //Equals 10


  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

}
