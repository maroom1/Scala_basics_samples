object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(25); 
  var str=Map(1-> "Foo");System.out.println("""str  : scala.collection.immutable.Map[Int,String] = """ + $show(str ));$skip(18); 
  println(str(2))}
}
