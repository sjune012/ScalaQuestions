object Question1{

  def main(args: Array[String]): Unit = {
    println(firstUniqueCharacter2("leetcode"))
  }

  def firstUniqueCharacter1(str: String): Int = {
    if (str.length > 1){
      val keys = str.zipWithIndex.groupBy(_._2).filter(_._2.length == 1)
      if (keys.size > 0) {
        keys.foldLeft(List [Int]()) {
          (count, num) => count :+ str.indexOf(num)
        }.sorted.head
      } else -1
    } else 0
  }

  def firstUniqueCharacter2(str: String): Int = {
    if (str.length > 1){
      val map = str.zipWithIndex.groupBy(_._1)
      val seq1 = map.filter(_._2.length == 1).keys.toSeq
      val ch = seq1.foldLeft(seq1(0)) {
        (count, ch) => if (str.indexOf(count) < str.indexOf(ch)) count
        else ch
      }
      str.indexOf(ch)
    } else -1
  }

}
