object Tenth {
  def main(args:Array[String]):Unit={
    var a = 17;
    var c = (a%2 ==0 || a%3==0) && a%2==0;
    print(c)
  }
}
