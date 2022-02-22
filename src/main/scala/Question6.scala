object Question6 {

  def main(args: Array[String]): Unit = {
    val list = List(
      "Suraj Prasad",
      "Suraj Kumar",
      "Mahesh Kumar",
      "Kumar"
    )
    val m = countWords(list)
    val m1 = m.toSeq.sortBy(list => (list._2, list._1)).toMap
    println(m1("Suraj"))

  }

  def countWords(list: List[String]): Map[String, Int] = {
    list.map {
      str =>
        val s1 = str.split(" ")
        s1.toList
    }.flatten.foldLeft(Map[String, Int]()) {
      (count, str) => count + (str -> (count.getOrElse(str, 0)+1))
    }
  }
}
