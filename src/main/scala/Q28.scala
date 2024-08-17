object Q28 {
  def main(args: Array[String]): Unit = {
    var a = 1;
    for (i <-1 to 24 by 2) {
      if(i%5!=0)
        print(i,"")
      else if(i%5==0)
        print("factor of five")
    }
  }
}
