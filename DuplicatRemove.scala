object DuplicatRemove {
 def main(array: Array[String]):Unit ={
   val liste = List(1,2,5,9,4,8,3,3,5)
   val result = liste.distinct
   println(result)
 }
}
