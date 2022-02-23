object Question10 {

  def main(args: Array[String]): Unit = {
    val list = List(2, 4, 1, 9, 12, 8)
    println(sum3(list))
  }

  def sum1(xs: List[Int]): Int = {
    def calculate(list: List[Int], sum: Int): Int = {
      if (list.isEmpty) -1
      list match {
        case head :: tail => calculate(tail, sum + head)
        case Nil => sum
      }
    }
    calculate(xs, 0)
  }

  def sum2(xs: List[Int]): Int = {
    xs.foldLeft(0)(_ + _)
  }

  def sum3(xs: List[Int]): Int = {
    xs.reduce(_ + _)
  }
}
