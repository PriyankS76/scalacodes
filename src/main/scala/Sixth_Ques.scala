object Sixth_Ques {
  def main(args:Array[String]):Unit= {
    var num = 20;
    var c = (1 to 10 contains num) || (20 to 30 contains num);
    print(c)
  }
}
