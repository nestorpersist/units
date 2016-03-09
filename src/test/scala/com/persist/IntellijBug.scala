package com.persist

import com.persist.Integers._

object IntellijBug {
  def main(args: Array[String]): Unit = {

    val c1 = U[P2,Z,Z,Z,Z,Z](2.0)

    // Intellij type of c2 has P3 not P6 for meter
    val c2 = c1 * (c1 * c1)
    // Show correctly displays meter:6
    println(c2.show)

    // In Intellij inc is in red!
    val c3 = U[P2#add[P2]#inc[P2],Z,Z,Z,Z,Z](5.1)
    // Show works and displays meter:6
    println(c3.show)

  }


}
