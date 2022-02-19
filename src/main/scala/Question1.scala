object Question1{

  def main(args: Array[String]): Unit = {
    println(firstUniqueCharacter("leetcode"))
  }

  def firstUniqueCharacter(str: String): Int = {
    if (str.length > 1){
      val keys = str.zipWithIndex.groupBy(_._2).filter(_._2.length == 1)
      if (keys.size > 0) {
        keys.foldLeft(List [Int]()) {
          (count, num) => count :+ str.indexOf(num)
        }.sorted.head
      } else -1
    } else 0
  }

}
