object Q25 {
  def main(args: Array[String]): Unit = {
    var a = 1;
    for (i <-4 to -12 by -1) {
      print(5,"*",i-1)
      a*=i;
    }
    println("Multiplied Value:", a)
  }
}
