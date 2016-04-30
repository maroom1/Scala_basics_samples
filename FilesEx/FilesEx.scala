

import java.io._

object FilesEx {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt" ))

      writer.write("Hello Scala")
      writer.close()
   }
}