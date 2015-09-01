package com.persist

import Integers._
import Mults._

object Units {

  // Base units

  val one = U[Z, Z, Z, Z, Z, Z](1)
  val meter = U[P1, Z, Z, Z, Z, Z](1)
  val gram = U[Z, P1, Z, Z, Z, Z](1)
  val second = U[Z, Z, P1, Z, Z, Z](1)
  val ampere = U[Z, Z, Z, P1, Z, Z](1)
  val bit = U[Z, Z, Z, Z, P1, Z](1)
  val dollar = U[Z, Z, Z, Z, Z, P1](1)

  // Length

  val mile = kilo(meter)(1.609344)
  val inch = centi(meter)(2.54)
  val foot = inch(12)
  val yard = foot(3)

  // Area

  val acre = square(foot)(43560)

  // Volume

  val liter = cube(deci(meter))
  val quart = cube(inch)(57.75)
  val gallon = quart(4)
  val pint = quart / 2
  val cup = pint / 2
  val tablespoon = cup / 16
  val teaspoon = tablespoon / 3

  // Mass

  val ounce = gram(28.3495)
  val pound = ounce(16)
  val ton = pound(2000)

  // Time

  val minute = second(60)
  val hour = minute(60)
  val day = hour(24)
  val week = day(7)

  // Info

  val byte = bit(8)

  // Currency

  val cent = dollar / 100

  // Derived

  val newton = kilo(gram) * per(meter, square(second))
  val hertz = 1 / second
  val pascal = per(newton, square(meter))
  val joule = newton * meter
  val watt = per(joule, second)
  val volt = watt / ampere
  val ohm = volt / ampere
  val siemens = 1 / ohm
  val henry = per(volt * second, ampere)
  val coloumb = ampere * second
  val farad = per(coloumb, volt)
  val weber = volt * second
  val tesla = per(weber, square(meter))

}
