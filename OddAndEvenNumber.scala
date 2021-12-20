import scala.collection.immutable.Range.Int

object OddAndEvenNumber {
  def main(array: Array[String]):Unit={
    var my_list =List(1,2,5,8,9,12,20,30,15)
    var count1 = 0
    var count2 = 0
    for (i <- my_list if i % 2 ==0) {
        println("Even number is: " +i)
    }
    for (j <- my_list if j % 2 != 0)
        println("Odd number is :" +j)
    }

}
