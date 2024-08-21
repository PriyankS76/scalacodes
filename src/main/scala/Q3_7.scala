object Q3_7 {
  def main(args: Array[String]): Unit = {
    for (i <- 7 to 1 by -1) {
      if (i % 2 != 0) {
        for (j <- i to 1 by -1) {
          print("*")
        }
        println()
      }
    }
    for (i <- 1 to 7) {
      if (i % 2 != 0) {
        for (j <- 1 to i) {
          print("*")
        }
        println()
      }
    }

  }
}
