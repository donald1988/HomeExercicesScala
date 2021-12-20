object MinAndMax {
  def main(array: Array[String]):Unit={
    var list = List(1,5,3,6,8,9,7,50,25)
    val big = list.max
    val small = list.min
    println("the maximum is : " +big)
    println("the minimum is :" +small)
    }
}
