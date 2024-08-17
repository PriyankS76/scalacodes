object Q4 {
  def main(args: Array[String]): Unit = {
    var a = 101;
    if (a > 100 && a < 1000) {
      println("Wrong number")
    }
    if (a % 2 == 0) {
      println("A is even")
      var b = a % 3
      print("Remainder after division by 3 is:")
      print(b)
    }
    else {
      var c = a % 2
      print("Remainder after division by 2 is :")
      print(c)
    }
    }
}
