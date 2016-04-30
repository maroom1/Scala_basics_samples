
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Exception12 {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
          println("file found")
      } catch {
         case ex: FileNotFoundException => {
            println("Missing file exception")
         }
         case ex: IOException => {
            println("IO Exception")
         }
      } finally {
         println("Exiting finally...")
      }
   }
}