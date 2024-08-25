object Arr_Q9 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1.2,1.1,3.2,44.2,5.4);
    var min_a = arr(0);
    for ( i<-0 to arr.length -1) {
      if (arr(i)<= min_a) {
        min_a = arr(i)
      }
    }
    var sec_min = arr(1);
    for (i<-0 to arr.length -1) {
      if(arr(i)< min_a)
        {
          sec_min(i)=min_a;
          min_a = arr(i)
        }
      else if(arr(i) < sec_min(i) && arr(i)!=min_a)
        {sec_min(i)= arr(i);}
    }
    println("Second min value is: "+ sec_min);
  }
}
