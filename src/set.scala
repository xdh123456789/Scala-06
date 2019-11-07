object set {
  def main(args: Array[String]): Unit = {
    //Set自动去重展示，内部不存在重复的值
    val set1=Set(1,2,3,4,5,6,7)
    val set2=Set(1,2,3,4)

    //无序输出，输出不是字面上的顺序，但是每个set的输出顺序是固定的
    set1.foreach(print)
    println()
    set2.foreach(print)
    println()

    //集合去交集的四种方法
    val result = set1.intersect(set2)
    result.foreach(println)
    println()

    val result2 = set1.&(set2)
    result2.foreach(print)
    println()

    val result3 = set1.diff(set2)
    result3.foreach(print)
    println()

    val result4 = set1.&~(set2)
    result4.foreach(print)
    println()


    //判断子集
    //x.subsetOf(y) 返回值为true x是y的子集 反之y是x的子集
    val result5: Boolean = set2.subsetOf(set1)

    println("result5:"+result5)
    println("min:"+set1.min+":----:max:"+set1.max)

    val result6: Array[Int] = set1.toArray;

    print("result6:")
    result6.foreach(print)

    println()
    val result7: List[Int] = set1.toList;

    print("result7:"+result7)
    println()

    var result8: String = set1.mkString;
    print("result8:"+result8)
    println()
    var reslut9 = set1.mkString("---");
    print("result9:"+reslut9)
    println()



  }

}
