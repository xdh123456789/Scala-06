object map {
  def main(args: Array[String]): Unit = {
    val map = Map(
      "name"->"xiedonghai",
      "age"->18,
      "favorgame"->"KingOfHonor"
    )

    println(map.get("name").get)

    //键值对._1 获取key
    //键值对._2 获取value
    for (i <-map){
      println("key:"+i._1+";"+"value:"+i._2)
    }
    map.foreach(i=>{
      println("key:"+i._1+";"+"value:"+i._2)
    })
    val result = map.keys
    result.foreach(print)
    println();
    println("---------------------")
    val result2: Iterable[Any] = map.values
    result2.foreach(print)
    println();
    //合并map
    val map1 = Map(
      (1,"a"),
      (2,"b"),
      (3,"c")
    )
    val map2 = Map(
      (1,1),
      (2,2),
      (2,900),
      (4,22),
      (5,22)
    )

    //将两个几何合并的方法
    val map3 = map1.++(map2)
    map3.foreach(print)
    println();
    val result3 = map1.filter(x=>{
      if (!x._2.equals("a")){
        true
      }
      else{
        false
      }
    })

    result3.foreach(print)
    println();

    //在做满足条件计数的时候，count会对进行去重复
    val result4 = map2.count(x=>{
      if (x._2>2)true
      else false
    })

    println();
    val result5 = map2.count(x=>{
      if(x._2>2){
        true
      }else{
        false
      }
    })

    println(result5)

    val result6 = map2.exists(x=>{
      x._2>10
    })

    println(result6)


  }

}
