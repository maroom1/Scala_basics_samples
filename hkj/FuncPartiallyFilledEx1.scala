
import java.util.Date
//this program is the  partially filled example
object FuncPartiallyFilledEx1 {
 
   def main(args: Array[String]) {
      val date = new Date
      val logWithDateBound = log(date, _ : String) 
      //To do so, we first bind a value to the date parameter and leave the 
      //second parameter unbound by putting an underscore at its place. The result is a 
      //partially applied function that we've stored in a variable.
      //We can now invoke this new method with only the unbound argument message as follows:

      logWithDateBound("message1" )
      Thread.sleep(1000)
      logWithDateBound("message2" )
      Thread.sleep(1000)
      logWithDateBound("message3" )
   }

   def log(date: Date, message: String)  = {
     println(date + "----" + message)
   }
}