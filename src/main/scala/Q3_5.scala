object Q3_5 {
  def main(args: Array[String]): Unit = {
var a=1;
    for (i <- 1 to 9) {
      if (i % 2 != 0) {
        for (j <- 1 to i) {
          if (j % 2 != 0)
            print("*")
          else
            print("_")
        }
        println()
      }
    }
  }
}
