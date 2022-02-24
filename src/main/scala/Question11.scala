object Question11 {

  def main(args: Array[String]): Unit = {
    val list = List(7, 2, 5, 4, 11)
    sample(list.sorted, 12) match {
      case Some(value) => println(value)
      case None => println("No pair found")
    }
  }

  def sample(list: List[Int], money: Int): Option[(Int, Int)] = {
    val list1 = list.toIndexedSeq
    def checkPair(l: Int, r: Int): Option[(Int, Int)] = {
      if (l + r > money) {
      val right = list1(list1.indexOf(r) - 1)
      checkPair(l, right)
      } else if (l + r < money) {
        val left = list1(list1.indexOf(l) + 1)
        checkPair(left, r)
      } else {
        Some((l,r))
      }
    }
    checkPair(list1.head, list1.last)
  }



}
