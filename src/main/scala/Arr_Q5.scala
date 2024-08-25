object Arr_Q5 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,3,4,5);
    var arr1 = Array(6,7,8,9,10);
    val merarr = new Array[Int](arr.length + arr1.length)
    for ( i<-0 to merarr.length -1) {
      if(i<arr.length)
      merarr(i)=arr(i);
      if(i>arr1.length)
        merarr(i)=arr(i+arr.length)
    }
    for ( i<-0 to merarr.length-1){
      println(merarr.length);
    }
  }
}
