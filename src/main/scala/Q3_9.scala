object Q3_9 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 5) {
             for (j <- 1 to i) {
          print("*")
        }
        println()
      }

    for (i <- 4 to 1 by -1) {

        for (j <- i to 1 by -1) {
          print("*")
        }
        println()
      }

  }
}
