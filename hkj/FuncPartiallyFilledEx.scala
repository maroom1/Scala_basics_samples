
import java.util.Date
//this program is the fully filled arguments next example will tell you about partially filled example
object FuncPartiallyFilledEx {
   def main(args: Array[String]) {
      val date = new Date
      log(date, "message1" )
      Thread.sleep(1000)
      log(date, "message2" )
      Thread.sleep(1000)
      log(date, "message3" )
   }

   def log(date: Date, message: String)  = {
     println(date + "----" + message)
   }
}