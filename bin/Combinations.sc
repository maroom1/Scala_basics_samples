object Combinations {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val data = List(1,2,3)                          //> data  : List[Int] = List(1, 2, 3)
  Set(1,2,3).subsets.map(_.toList).toList         //> res0: List[List[Int]] = List(List(), List(1), List(2), List(3), List(1, 2), 
                                                  //| List(1, 3), List(2, 3), List(1, 2, 3))
val res  = for(i <- 1 to data.size) yield List(1, 2, 3).combinations(i).toList
                                                  //> res  : scala.collection.immutable.IndexedSeq[List[List[Int]]] = Vector(List(
                                                  //| List(1), List(2), List(3)), List(List(1, 2), List(1, 3), List(2, 3)), List(L
                                                  //| ist(1, 2, 3)))

def powerset[A](s: Set[A]) = s.foldLeft(
                            Set(Set.empty[A]))
                            { case (acc, v) =>  acc ++ acc.map(_ + v)  }
                                                  //> powerset: [A](s: Set[A])scala.collection.immutable.Set[scala.collection.immu
                                                  //| table.Set[A]]
powerset(data.toSet)                              //> res1: scala.collection.immutable.Set[scala.collection.immutable.Set[Int]] = 
                                                  //| Set(Set(), Set(1, 3), Set(2), Set(1, 2), Set(2, 3), Set(3), Set(1, 2, 3), Se
                                                  //| t(1))
data.foldLeft(List(List.empty[Int]) )
                          { case (acc, x) => acc ++ acc.map(x :: _)  }
                                                  //> res2: List[List[Int]] = List(List(), List(1), List(2), List(2, 1), List(3), 
                                                  //| List(3, 1), List(3, 2), List(3, 2, 1))
}