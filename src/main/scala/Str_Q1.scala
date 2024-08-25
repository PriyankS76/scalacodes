object Str_Q1 {
  def main(args: Array[String]): Unit = {


    println("enter the size")
    val size = scala.io.StdIn.readInt()
    val arr = new Array[String](size)
    for (i <- 0 until arr.length) {

      println("enter the string elements at" + " " + i)
      arr(i) = scala.io.StdIn.readLine()
          }
    var count = 0;
    for (i <- 0 until arr.length) {
      if(arr(i) == "e")
        { count+=1;}
            }
    println("Count of string is "+ count);

  }
}
