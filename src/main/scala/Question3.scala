object Question3 {

  def main(args: Array[String]): Unit = {
    val bool = if ("PPALLP".exists(_ == 'L')) {
      if (checkRecord("PPALLLP", 1) > 2) false
      else true
    }
    println(bool)
  }

  def checkRecord(s: String): Boolean = {
    if (s.length > 1 || s.length < 1000) {
      val cond1 = s.count(_ == 'A') < 2
      val cond2 = s.containsSlice("LLL")
      cond1 && !cond2
    } else true
  }

  def checkRecord(s: String, count: Int): Int = {
    val list = s.toList
    list match {
      case head :: tail => if (head == 'L' && tail.head == 'L') {
        checkRecord(list.tail.mkString, count + 1)
      } else {
        checkRecord(list.tail.mkString, count)
      }
      case Nil => count
    }
  }

}
