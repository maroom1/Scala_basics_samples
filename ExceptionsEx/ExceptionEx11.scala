
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object ExceptionEx11 {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt") // keep input.txt file in root folder
      } catch {
         case ex: FileNotFoundException =>{
            println("Missing file exception")
         }
         case ex: IOException => {
            println("IO Exception")
         }
      }
   }
}