import scala.annotation.tailrec

/*
  Lexical Scope - example
 */
val x = 0

def f(y: Int) = y + 1
val result = {
  val x = f(3);
  x * x
} + x

/*
 No tail recursion
 */
def factorial(n: Int): Int = {

  @tailrec
  def loop(acc: Int, n: Int): Int =
    if(n == 0) acc
    else loop(acc * n, n - 1)

  loop(1, n)
}

factorial(8)

/*
 Tail recursion: can execute in constant stackspace = iterative process
 */
@tailrec
def gcd(a: Int, b: Int): Int =
if(b == 0) a else gcd(b, a % b)

gcd(14, 21)

