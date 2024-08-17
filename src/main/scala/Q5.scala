object Q5 {
  def main(args: Array[String]): Unit = {
    var a = 21;
    if (a < 0 || a > 100) {
      println("Invalid input")
    }
    else if (a >= 90 && a < 100) {
      println("Super smart")
    }
    else if (a >= 80 && a < 90) {
      println("Smart")
    }
    else if (a >= 70 && a < 80) {
      println("Smart Enough")
    }
    else if (a >= 60 && a < 70) {
      println("Just Smart")
    }
    else if (a >= 35 && a < 60) {
      println("No Smart")
    }
    else if (a >= 0 && a < 35) {
      println("Dump")
    }
  }
}
