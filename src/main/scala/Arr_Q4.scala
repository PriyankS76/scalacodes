object Arr_Q4 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1.2,2.3,3.2,44.2,5.4);
    var max_a = arr(0);
    for ( i<-0 to arr.length -1) {
      if (arr(i)>= max_a) {
        max_a = arr(i)
      }
    }
      println("Maximum value is: "+ max_a);
  }
}
