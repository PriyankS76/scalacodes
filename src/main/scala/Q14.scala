object Q14 {
  def main(args: Array[String]): Unit = {
    var a = 0;
    for (i <- 20 until 140 by 4) {
      if (i % 2 == 0) {
        a = i + 2
        println(a)
      }
    }
  }
}
