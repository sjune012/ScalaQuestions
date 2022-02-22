object Question5 {

  def main(args: Array[String]): Unit = {
    val a = uncommonFromSentences("this apple is sweet", "this apple is sour")
    a foreach(i => println(i))
  }

  def uncommonFromSentences(s1: String, s2: String): Array[String] = {
    val a1 = s1.split(" ")
    val a2 = s2.split(" ")
    val m3 = a1.foldLeft(Map[String, Int]()) {
      (count, str) => count + (str -> (count.getOrElse(str, 0)+1))
    } ++
    a2.foldLeft(Map[String, Int]()) {
      (count, str) => count + (str -> (count.getOrElse(str, 0)+1))
    }
    m3.filter(_._2 == 1).keys.toArray
  }
}
