object Question8 {

  def main(args: Array[String]): Unit = {
    val intervals = getMergedIntervals(Array(Array(7,7), Array(2,3), Array(6, 11), Array(1,2)))
    intervals.toList.foreach(ints => println(ints.toList))
  }

  def getMergedIntervals(array: Array[Array[Int]]): Array[Array[Int]] = {
    if(array.flatten.length == 0) array
    val intervals = array.map(r => (r(0), r(1)) ).sortBy(_._1)

    def travel(data: List[(Int, Int)], l: Int, r: Int): List[(Int, Int)] = {
      data match {
        case Nil => List((l,r))
        case head :: tail =>
          val (node_l, node_r) = (head._1, head._2)
          if (node_l <= r && node_l >= l) travel(tail, l, math.max(node_r, r))
          else (l, r) :: travel(tail, node_l, node_r)
      }
    }
    val merged = travel(intervals.toList, intervals.head._1, intervals.head._2)
    merged.map(entry => Array(entry._1, entry._2)).toArray
  }

}
