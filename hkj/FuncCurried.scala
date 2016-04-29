

object FuncCurried {

   def main(args: Array[String]) {
      val str1:String = "Hello, "
      val str2:String = "Scala"
      val str3:String=" world!"
      println( "str1 + str2 + str3= " +  strcat(str1)(str2)(str3) )
   println( "str1 + str2 = " +  strcat1(str1)(str2) )
   println(strcat1("hello")(" World"))
      
   }

   def strcat(s1: String)(s2: String)(s3:String) = {
      s1 + s2+s3
   }
   def strcat1(s1: String) = (s2: String) => s1 + s2 //if we have onky two argument we can write like this
}