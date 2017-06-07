def abs(x: Double) = if (x < 0) -x else x

def sqrt(x: Double) = {
  def sqrtIter(guess: Double, x: Double): Double =
    if( isGoodEnough(guess)) guess
    else sqrtIter(improve(guess), x)

  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double) =
    (guess + x/ guess) / 2
}

val x = 0

def f(y: Int) = y + 1
val result = {
  val x = f(3);
  x * x
} + x






sqrt(2)
sqrt(0.001)
sqrt(0.1e-20)
sqrt(1.0e20)
sqrt(1.0e50)



