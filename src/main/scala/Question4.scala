object Question4 {

  def main(args: Array[String]): Unit = {
    val name = Array("ball", "bat", "glove", "glove", "glove" , "glove", "ball")
    val price = Array(2, 3, 1, 2, 1, 1, 2)
    val weight = Array(2, 5, 1, 1, 1, 1, 2)
    println(numDuplicates(name, price, weight))
  }

  def numDuplicates(name: Array[String], price: Array[Int], weight: Array[Int]): Int = {
   val array = name zip price zip weight map {
     case ((a, b), c) => (a, b, c)
   } map {
     i => Product(i._1, i._2, i._3)
   }
    array.toList.size - array.toList.distinct.size
  }
}

case class Product(name: String,
                   price: Int,
                   weight: Int)
