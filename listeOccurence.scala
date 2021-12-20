object listeOccurence {
  def list_elemnt_occurrences[A](list1:List[A]):Unit = {
    list1.groupBy(el => el).map(e => (e._1, e._2.length))
  }
  def main(array: Array[String]): Unit = {
      val s = List("apple", "oranges", "apple", "banana", "apple", "oranges", "oranges")
      println(list_elemnt_occurrences(s))
    }

}
