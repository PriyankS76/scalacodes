object Arr_Q8 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,3,4,5);
    for ( i<-0 to arr.length -1) {
      if(arr(i)%2 != 0)
      println(arr(i));}
  }
}
