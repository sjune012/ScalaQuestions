object Question7 {

  def main(args: Array[String]): Unit = {
    println(removeDuplicates(Array(1, 1, 2, 3, 2)))
  }

  def removeDuplicates(ints: Array[Int]): Int = {
    ints.foldLeft(List[Int]()) {
      (count, num) => if (count.exists(_== num)) count
      else count :+ num
    }.size
  }

}
