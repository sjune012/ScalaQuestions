object Question9 {

  def main(args: Array[String]): Unit = {
    val list = List(2, 4, 1, 9, 12, 8)
    println(findMin(list, Integer.MAX_VALUE))
    println(findMax(list, Integer.MIN_VALUE))
  }

  @scala.annotation.tailrec
  def findMin(list: List[Int], min: Int): Int = {
    list match {
      case head :: tail => findMin(tail, if (head < min) head else min)
      case Nil => min
    }
  }

  @scala.annotation.tailrec
  def findMax(list: List[Int], max: Int): Int  = {
    list match {
      case head :: tail => findMax(tail, if (head > max) head else max)
      case Nil => max
    }
  }
}
