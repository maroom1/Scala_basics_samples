

class Foo1(val name: String, val age: Int, val sex: Symbol)

object Foo1 {
  def apply(name: String, age: Int, sex: Symbol) = new Foo1(name, age, sex)
}
object ListFoldLeft extends App{
  val fooList = Foo1("Hugh Jass", 25, 'male) ::
              Foo1("Biggus Dickus", 43, 'male) ::
              Foo1("Incontinentia Buttocks", 37, 'female) ::
              Nil
              val stringList = fooList.foldLeft(List[String]()) { (z, f) =>
      val title = f.sex match {
        case 'male => "Mr."
        case 'female => "Ms."
      }
  z :+ s"$title ${f.name}, ${f.age}"
    
  }
  
  println(stringList)
   for(i<- 0 until stringList.length)
      println(stringList(i))
  
}