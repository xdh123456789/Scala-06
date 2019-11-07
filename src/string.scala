object string {
  def main(args: Array[String]): Unit = {
    /**
      * String && StringBuilder
      */
    val str = "abcd"
    val str1 = "ABCD"

    println(str.indexOf(97))
    println(str.indexOf(99))

    println(str==str1)
    /**
      * compareToIgnoreCase
      *
      * 如果参数字符串等于此字符串，则返回值 0；
      * 如果此字符串小于字符串参数，则返回一个小于 0 的值；
      * 如果此字符串大于字符串参数，则返回一个大于 0 的值。
      *
      */
    println(str.compareToIgnoreCase(str1))

    val strBuilder = new StringBuilder
    strBuilder.append("abc")
    //    strBuilder.+('d')
    strBuilder +'d'
    //    strBuilder.++=("efg")
    strBuilder++= "efg"
    //    strBuilder.+=('h')
    strBuilder+= 'h'
    strBuilder.append(1.0)
    strBuilder.append(18)
    println(strBuilder)
  }
}
