package com.persist.Integers

trait Integer {
  type prev <: Integer
  type next <: Integer
  type inc[other <: Integer] <: Integer
  type dec[other <: Integer] <: Integer
}

class PosTooBig extends Integer {
  type prev = PosTooBig
  type next = PosTooBig
  type inc[other <: Integer] = PosTooBig
  type dec[other <: Integer] = PosTooBig
}

class NegTooBig extends Integer {
  type prev = NegTooBig
  type next = NegTooBig
  type inc[other <: Integer] = NegTooBig
  type dec[other <: Integer] = NegTooBig
}

trait Pos extends Integer {
  type inc[other <: Integer] = prev#inc[other#next]
  type dec[other <: Integer] = prev#dec[other#prev]
}

class Z extends Integer {
  type prev = N1
  type next = P1
  type inc[other <: Integer] = other
  type dec[other <: Integer] = other
}

trait Neg extends Integer {
  type inc[other <: Integer] = next#inc[other#prev]
  type dec[other <: Integer] = next#dec[other#next]
}

class P1 extends Pos {
  type prev = Z
  type next = P2
}

class P2 extends Pos {
  type prev = P1
  type next = P3
}
class P3 extends Pos {
  type prev = P2
  type next = P4
}
class P4 extends Pos {
  type prev = P3
  type next = P5
}
class P5 extends Pos {
  type prev = P4
  type next = P6
}
class P6 extends Pos {
  type prev = P5
  type next = P7
}
class P7 extends Pos {
  type prev = P6
  type next = P8
}
class P8 extends Pos {
  type prev = P7
  type next = P9
}
class P9 extends Pos {
  type prev = P8
  type next = P10
}
class P10 extends Pos {
  type prev = P9
  type next = PosTooBig
}

class N1 extends Neg {
  type prev = N2
  type next = Z
}
class N2 extends Neg {
  type prev = N3
  type next = N1
}
class N3 extends Neg {
  type prev = N4
  type next = N2
}
class N4 extends Neg {
  type prev = N5
  type next = N3
}
class N5 extends Neg {
  type prev = N6
  type next = N4
}
class N6 extends Neg {
  type prev = N7
  type next = N5
}
class N7 extends Neg {
  type prev = N8
  type next = N6
}
class N8 extends Neg {
  type prev = N9
  type next = N7
}
class N9 extends Neg {
  type prev = N10
  type next = N8
}
class N10 extends Neg {
  type prev = NegTooBig
  type next = N9
}

