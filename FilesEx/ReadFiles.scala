


import scala.io.Source

object ReadFiles {
   def main(args: Array[String]) {
      println("Following is the content read:" )

      Source.fromFile("test.txt" ).foreach{ 
         print 
      }
   }
}