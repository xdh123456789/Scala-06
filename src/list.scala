object list {
  def main(args: Array[String]): Unit = {

    //声明集合
    val mylist = List(1,2,3,4,5,6,7,8,9)
    for (i<-mylist){
      println(i)
    }
   // mylist.foreach(i=>println(i))

    //过滤元素
    /*
    val result: List[Int] =mylist.filter((i:Int)=>{
      if(i<1) true
      else false
    })

    result.foreach(println)
    */


    /*
    val result = mylist.count(x=>{
      if (x<1) true
      else false
    })

    println(result)
*/
    val result2 = mylist.map(x=>{
      x+1
    })
    result2.foreach(println)
  }

}
