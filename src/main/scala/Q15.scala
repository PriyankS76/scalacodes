object Q15 {
  def main(args: Array[String]): Unit = {
    var a = 1;
    for (i <- 2 until 17) {
      print(i)
      print("*")
      print(i+1)
      print(",")
      a*=i;
    }
    println("Multiplied Value:", a)
}
}