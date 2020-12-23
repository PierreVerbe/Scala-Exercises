package Scala

object HelloHello extends App {

  val myList = List(1, 5, 0, 2, 30, 9, 3, 8, 15, 10, 4, 7, 5, 6, 20)

  println("Multiple de 2 : " + filterList(myList, multiple2))
  println("Multiple de 3 : " + filterList(myList, multiple3))
  println("Multiple de 5 : " + filterList(myList, multiple5))
  println("Multiple de 10 : " + filterList(myList, multiple10))

  //HFO
  def filterList(theList: List[Int], theFct: Int => Boolean): List[Int] = {
    if (theList.isEmpty) theList
    else if (theFct(theList.head)) theList.head :: filterList(theList.tail, theFct)
    else filterList(theList.tail, theFct)
  }

  def multiple2(n: Int): Boolean = {
    if (n % 2 == 0) true
    else false
  }

  def multiple3(n: Int): Boolean = {
    if (n % 3 == 0) true
    else false
  }

  def multiple5(n: Int): Boolean = {
    if (n % 5 == 0) true
    else false
  }

  def multiple10(n: Int): Boolean = {
    if (n % 10 == 0) true
    else false
  }

  //currying fct

  val myFamily = List("Joe", "Maria", "Monsieur", "Madame")
  salutationFamille(myFamily, salutationPersonne("Bernard"))

  def salutationPersonne(nom: String)(prenom: String): String = {
    val phrase: String = "Bonjour " + prenom + " " + nom + " etc..."
    phrase
  }

  def salutationFamille(famille: List[String], theFct: String => String): Unit = {
    for (membre <- famille) {
      println(theFct(membre))
    }
  }

}