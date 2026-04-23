import java.io.IOException

@main def ControlStructures(): Unit =

  //if else then
              if 4 < 3 then
                println("3 is smaller..")
              else if 7 < 7 then
                println("6 is smaller")
              else
                println("negative")


  //for loop
                val inst = List(4, 6, 7, 9, 3)
                for i <- inst // generator
                  do
                    println() //body of loop

                //guards
                val ints = List(1, 2, 8, 3, 9, 10, 34, 28)
                for i <- ints
                    if i > 2
                do
                  println()


    // multiple guards and generators
                for
                  i <- 1 to 6
                  j <- 'a' to 'c'
                  if i == 2
                  if j == 'b'
                do
                  println(s"i = $i, j = $j")   // prints: "i = 2, j = b"


  // for expressions
                val oldList = List(1, 2, 3, 4, 5)
                val doubles = for oL <- oldList yield oL * 2 // for expression with yield keyword
                // println(doubles)


                //for expression iterates over a list of strings and returns the length of each string, but only if that length is greater than 4
                val fruits = List("apple", "banana", "lime", "orange")
                for f <- fruits
                    if f.length <= 4
                yield
                  println(f)

  // match expressions
                val im = 2
                im match
                  case 1 => println("1 matches One")

                  case 2 => println("2 matches Two")

                  case 3 => println("3 matches Three")

                  case _ => println("no match found")



      // a method that can accept any input and will match it the case data types and returns input value type
                  def getClassAsString(x: Matchable): String = x match

                  case s: String => s"'$s' is string value"
                  case i: Int => "Int value"
                  case d: Double => "Double value"
                  case l :List[?] => "List"
                  case _ => "Unknown"

                  //calling above method
                println(getClassAsString("hello world"))

      // try/catch/finally
                val num="abc"
                try
                println(num.toInt)

                catch
                  case ioe : IOException => println("Got an exception..")
                  case nfe: NumberFormatException => println("Its a numberformat exception")
                finally
                  println("clean up your resources!")


      // while loop control structure
                var x = 1
                while x < 3
                  do
                  println(x)
                  x += 1