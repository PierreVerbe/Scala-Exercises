object HelloWorld extends App{
  println("Hello Scala")
}

/*
  Fibonacci series : next number is the sum of previous two numbers
  ex : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55


  def fibonacciSeries(n: Int) : Int = {
    var n0 = 0
    var n1 = 1

    if (n < 2) n
    else{
      var temp = 0
      for(i <- 2 to n){
        temp = n0 + n1
        n0 = n1
        n1 = temp
      }
      n1
    }
  }

  def fibonacciSeriesRecursive(n: Int) : Int = {
    if (n < 2) n
    else fibonacciSeriesRecursive(n - 1) + fibonacciSeriesRecursive(n - 2)
  }

  def fibonacciSeriesTailRecursive(n: Int, n0: Int, n1 :Int) : Int = {
    //if (n <= 1) return n
    if (n == 0) return n0
    else if (n == 1) return n1
    fibonacciSeriesTailRecursive(n - 1, n1, n0 + n1)
  }

  Concatenate string

  Bubble sort

  cantor

  PGCD

  Triangle de Pascal
 */