/*
  High order function
*/
def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if(a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}

sum(x => x * x, 3, 5)

/*
  Currying
*/
def sumCurr(f: Int => Int): (Int, Int) => Int = {
  def loop(a: Int, b: Int): Int = {
    if(a > b) 0
    else f(a) + loop(a + 1, b)
  }
  loop
}

sumCurr(x => x * x)


def product(f: Int => Int)(a: Int, b: Int): Int =
  if(a > b) 1
  else f(a) * product(f)(a+1, b)

product(x => x * x)(3, 4)

def fact(n: Int) = product( x => x)(1, n)

fact(5)

product(x => x * x)(3, 4)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if(a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1,b))





