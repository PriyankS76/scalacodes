object Q3_10 {
  def main (args: Array[String]): Unit
  =
  {
    var k = 4;
    for (i <- 1 to 9) {
      if (i % 2 != 0) {
        for (j <-1 to k) {
          print(" ")
        }
        for (l <-1 to i) {
          print("*")
        }
        k-=1

        println()
      }
    }
  }
}
