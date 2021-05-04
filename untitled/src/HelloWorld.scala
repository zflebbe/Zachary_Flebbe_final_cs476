object HelloWorld {
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]) {
    val plus = (i: Int) => i + 1
    println("Hello, world!") // prints Hello World
    println(applyFuntionNTimes(plus, 3));
  }


  def factorial(n: Int, f: val): val = {
    println("ok :" + n);
    if (n <= 1)
      return (i:Int, f: val) => f(i)
    else
    return (i:Int, f: val) => f(factorial(n - 1, f)(i))
  }


  def applyFuntionNTimes( f: val, n: Int) : val = {
    factorial(f, n)
  }

}
