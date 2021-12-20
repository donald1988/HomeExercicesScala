object SumAndProduct {
  def main(array: Array[String]):Unit= {
    val liste = List(1,2,5,9,4,8,3)
    val sum = liste.sum
    val product = liste.product

    println("the Sum of the List Element is :" +sum)
    println("the product of the list element is : " +product)
  }
}