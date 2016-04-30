

object CollectionList {

   def main(args: Array[String]) {
      val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
      val nums = Nil
 val fruit1: List[String] = List("apples", "oranges", "pears")
 val nums1: List[Int] = List(1, 2, 3, 4)
 // Empty List.
val empty: List[Nothing] = List()

// Two dimensional list
val dim1: List[List[Int]] =
   List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
   )
   // List of Strings
val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))

// List of Integers
val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))

// Empty List.
val empty2 = Nil

// Two dimensional list
val dim2 = (1 :: (0 :: (0 :: Nil))) ::
          (0 :: (1 :: (0 :: Nil))) ::
          (0 :: (0 :: (1 :: Nil))) :: Nil
      println( "Head of fruit : " + fruit.head )
      println( "Tail of fruit : " + fruit.tail )
      println( "Check if fruit is empty : " + fruit.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
      println( "Head of fruit1 : " + fruit1.head )
      println( "Tail of fruit1 : " + fruit1.tail )
      println( "Check if fruit1 is empty : " + fruit1.isEmpty )
      println( "Check if nums1 is empty : " + nums1.isEmpty )
      println( "Head of fruit2 : " + fruit2.head )
      println( "Tail of fruit2 : " + fruit2.tail )
      println( "Check if fruit2 is empty : " + fruit2.isEmpty )
      println( "Check if nums2 is empty : " + nums2.isEmpty )
      println( "Head of dim1 : " + dim1.head )
      println( "Tail of dim1 : " + dim1.tail )
      println( "Check if dim1 is empty : " + dim1.isEmpty )
      println( "Check if empty2 is empty : " + empty2.isEmpty )
       println( "Head of dim2 : " + dim2.head )
      println( "Tail of dim2 : " + dim2.tail )
      println( "Check if dim2 is empty : " + dim2.isEmpty )
      println( "Check if empty is empty : " + empty.isEmpty )
   }
}