object Question2{

  def main(args: Array[String]): Unit = {
    println(frequencySort("tree"))
  }

  def frequencySort(str: String): String = {
    if (str.length > 1) {
      str.foldLeft(Map[Char, Int]()) {
        (count, ch) => count + (ch -> (count.getOrElse(ch, 0) + 1))
      }.toList.sortBy(_._2)(Ordering.Int.reverse).foldLeft("") {
        (count, ch) => count + ch._1.toString() * ch._2
      }
    }else str
  }
}
