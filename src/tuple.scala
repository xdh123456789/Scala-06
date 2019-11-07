object tuple {
  def main(args: Array[String]): Unit = {
    val tuple1 = new Tuple1(1)
    val tuple2 = Tuple2("heihei","hehe")
    val tuple22 = Tuple22(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)
    println(tuple2._1+"-------------"+tuple2._2)

    //元组遍历不可使用for或者是foreach
    //采用的是迭代器Iterator
    val iterator = tuple22.productIterator
    while (iterator.hasNext)
      {
        println(iterator.next())
      }
  //交换值
    val tuple3 = tuple2.swap
    println(tuple3._1+"----------"+tuple3._2)
    println(tuple2._1+":"+tuple2._2)
    println(tuple2.toString())

  }

}
