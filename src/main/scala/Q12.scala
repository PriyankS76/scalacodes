object Q12 {
  def main(args: Array[String]): Unit = {
    var c = 0;
      for (i <- 700 to 900) {
      if (i % 2 == 0)
        c+=1;
      }
    println(c)
    }
}
