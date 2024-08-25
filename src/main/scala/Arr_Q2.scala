object Arr_Q2 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,3,4,5);
    var sum = 0;
    for ( i<-0 to arr.length -1) {
      sum+=arr(i);
      }
    println("Sum of array is "+ sum);
  }
}
