package com.gitHub.scalaExercises.regex

import scala.util.matching.Regex

object Ipv4Address extends App {

  /*
  IPV4 address : Use a regex to know if the word is an ipv4 address
  ex : 192.168.1.0
   */

  //Not an IPV4 address
  println("Is 192.0.0 an IPV4 address ? " + isIpv4Address("192.0.0"))

  //Is an IPV4 address
  println("Is 192.168.1.0 an IPV4 address ? " + isIpv4Address("192.168.1.0"))

  def isIpv4Address(ip: String): Boolean = {
    val pattern = new Regex("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b")
    pattern.unapplySeq(ip).isDefined
  }

}
