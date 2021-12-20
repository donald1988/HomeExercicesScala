import scala.io.Source


object WordCounter {
  def main(array: Array[String]):Unit ={
    val map =  Source.fromFile("shakespeare.txt")
    for (line <- map.getLines()){
      print(line.toUpperCase)

    }
   map.close()
  }
}
