object Q18 {
  def main(args: Array[String]): Unit = {
    var s = 0;
    var n = 0;
    for (i <-24 to 100 by 2) {
      s += i;
      n += 1;
    }
    print("Average is:",s/n)
    }

}
