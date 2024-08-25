object Arr_Q6 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,3,4,5);
    var sum = 0;
    var avg = 0 : Double;
    for ( i<-0 to arr.length -1) {
      sum+=arr(i);
    }
    avg = sum/(arr.length-1);
    println("Average is "+ avg);
  }
}
