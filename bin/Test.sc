object Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var str=Map(1-> "Foo")                          //> str  : scala.collection.immutable.Map[Int,String] = Map(1 -> Foo)
  println(str(2))                                 //> java.util.NoSuchElementException: key not found: 2
                                                  //| 	at scala.collection.MapLike$class.default(MapLike.scala:228)
                                                  //| 	at scala.collection.AbstractMap.default(Map.scala:59)
                                                  //| 	at scala.collection.MapLike$class.apply(MapLike.scala:141)
                                                  //| 	at scala.collection.AbstractMap.apply(Map.scala:59)
                                                  //| 	at Test$$anonfun$main$1.apply$mcV$sp(Test.scala:4)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at Test$.main(Test.scala:1)
                                                  //| 	at Test.main(Test.scala)
}