object Q3_6 {
  def main(args: Array[String]): Unit = {
    var k =4
    for (i <- 1 to 9) {
      if (i % 2 != 0) {
        for (j <-1 to k) {
          print(" ")
        }
                for (j <- 1 to i) {
          print("*")
        }
        k-=1
        println()
      }
    }
    var l =1
    for (i <- 7 to 1 by -1) {
      if (i % 2 != 0) {
        for (j <-1 to l) {
          print(" ")
        }
        for (j <- i to 1 by -1) {
          print("*")
        }
        l+=1
        println()
      }
    }
  }
  }
