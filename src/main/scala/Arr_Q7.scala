object Arr_Q7 {
  def main(args: Array[String]): Unit = {
    var arr = Array('a','b','c','d','e');
    for ( i<- arr.length-1 to 0 by -1) {
      if(arr(i) == 'd')
      println("Specific string is "+ arr(i));}
  }
}
