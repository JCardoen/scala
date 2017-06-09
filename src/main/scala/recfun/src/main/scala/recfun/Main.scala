package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println("Balancing paranthesis")
    println(balance("(just) an example".toList))
    println(balance("(just an example".toList))
    println(balance("())(".toList))
    var list = List[Int](1,2)
    println(countChange(5,list ))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if(c == 0 || r == c) 1
      else pascal(c, r-1) + pascal(c-1, r-1)


  var test = List[Char]()

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def checkOpen(chars: List[Char], openParenthesis: Int): Boolean = {
        if(chars.isEmpty) openParenthesis == 0
        else {
          val parenthesisCount =
            if(chars.head.equals('(')) openParenthesis + 1
            else if(chars.head.equals(')')) openParenthesis - 1
            else openParenthesis

          if(parenthesisCount >= 0) checkOpen(chars.tail, parenthesisCount)
          else false
        }
      }
      checkOpen(chars, 0)
    }



  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
      if(coins.isEmpty || money < 0) 0
      else if(money == 0) 1
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
