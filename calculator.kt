class Calculator(val name: String) {
  init {
    println("$name's Calculator ")
  }

  //To practice anonymous functions
  
  fun add(a: Int, b: Int): Int {
    return a + b
  }
  
  fun subtract(a: Int, b: Int): Int {
    return a - b
  }
  
  fun multiply(a: Int, b: Int): Int {
    return a * b
  }
  
  fun divide(a: Int, b: Int): Any {
    if (b == 0) {
      return "Error. Cannot divide by O." 
    } else {
      return a / b
    } 
  }
  
  fun power(a: Int, b: Int): Int {
    var result = 1

    for (i in 1..b) {
      result *= a
    } 
    return result
  } 
}
  
fun main() {
  var myCalculator = Calculator("Nick's Calc")

  //Test Logic
  
  println(myCalculator.add(100, 50))
  println(myCalculator.subtract(77, 11))
  println(myCalculator.divide(36, 6))
  println(myCalculator.power(3, 2))
}
