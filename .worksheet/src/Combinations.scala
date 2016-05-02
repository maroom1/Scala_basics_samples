object Combinations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(25); 
  val data = List(1,2,3);System.out.println("""data  : List[Int] = """ + $show(data ));$skip(42); val res$0 = 
  Set(1,2,3).subsets.map(_.toList).toList;System.out.println("""res0: List[List[Int]] = """ + $show(res$0));$skip(79); 
val res  = for(i <- 1 to data.size) yield List(1, 2, 3).combinations(i).toList;System.out.println("""res  : scala.collection.immutable.IndexedSeq[List[List[Int]]] = """ + $show(res ));$skip(162); 

def powerset[A](s: Set[A]) = s.foldLeft(
                            Set(Set.empty[A]))
                            { case (acc, v) =>  acc ++ acc.map(_ + v)  };System.out.println("""powerset: [A](s: Set[A])scala.collection.immutable.Set[scala.collection.immutable.Set[A]]""");$skip(21); val res$1 = 
powerset(data.toSet);System.out.println("""res1: scala.collection.immutable.Set[scala.collection.immutable.Set[Int]] = """ + $show(res$1));$skip(109); val res$2 = 
data.foldLeft(List(List.empty[Int]) )
                          { case (acc, x) => acc ++ acc.map(x :: _)  };System.out.println("""res2: List[List[Int]] = """ + $show(res$2))}
}
