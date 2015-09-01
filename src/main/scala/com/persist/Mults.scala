package com.persist

import Integers._
import Dims._

object Mults {

  implicit def dToU(v: Double) = U[Z, Z, Z, Z, Z, Z](v)

  implicit def iToU(v: Int) = U[Z, Z, Z, Z, Z, Z](v.toDouble)

  implicit def lToU(v: Long) = U[Z, Z, Z, Z, Z, Z](v.toDouble)


  def deka[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * 10.00

  def hecto[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * 100.0

  def kilo[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * 1000.0

  def mega[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = kilo(v) * 1000.0

  def giga[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = mega(v) * 1000.0

  def tera[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = giga(v) * 1000.0

  def peta[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = tera(v) * 1000.0

  def exa[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = peta(v) * 1000.0

  def zetta[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = exa(v) * 1000.0

  def yota[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = zetta(v) * 1000.0


  def deci[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * 0.1

  def centi[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * 0.01

  def milli[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * 0.001

  def micro[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = milli(v) * 0.001

  def nano[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = micro(v) * 0.001

  def pico[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = nano(v) * 0.001

  def femto[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = pico(v) * 0.001

  def atto[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = femto(v) * 0.001

  def zepto[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = atto(v) * 0.001

  def yocto[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = zepto(v) * 0.001


  def square[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * v

  def cube[m <: Meters, g <: Grams, s <: Seconds, a <: Amperes, b <: Bits, d <: Dollars](v: U[m, g, s, a, b, d]) = v * v * v

  def per[m1 <: Meters, g1 <: Grams, s1 <: Seconds, a1 <: Amperes, b1 <: Bits, d1 <: Dollars,
  m2 <: Meters, g2 <: Grams, s2 <: Seconds, a2 <: Amperes, b2 <: Bits, d2 <: Dollars]
  (v1: U[m1, g1, s1, a1, b1, d1], v2: U[m2, g2, s2, a2, b2, d2]) = v1 / v2

}
