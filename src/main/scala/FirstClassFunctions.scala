// This is very important topic of scala
/*
First-class functions mean functions are treated like values in Scala.

You can:
store a function in a variable
pass a function as parameter
return a function from another function
for example
List(1,2,3).map(_ * 2)
List(1,2,3).map(x => x * x)
List(1,2,3).map(_ + 10)
inside map we are passing behaviour as arguments rather than data _*2, x=>x*x, _+10

concepts of first class function
1. in scala functions are objects, they have apply method method so as to make function callable

 */

@main def run(): Unit =
  val double = (x: Int) => x * 2 //variable that holds lambda function in double variable
  println(double(5)) // calling 5 directly inside double is due to apply method of scala


@main def add(): Unit =
  val addTen = (x: Int) => x + 10
  println(addTen(2))

@main def addTwoParam(): Unit =
  val addTwoParam = (x: Int, y: Int) => x + y
  println(addTwoParam(3, 8))

@main def greetingLmbda(): Unit =
  val greetLambda = (name: String) => "Hello " + name
  println(greetLambda("sabia"))

@main def squareLambda(): Unit =
  val squareLmbda = (s: Int) => s * s
  println(squareLmbda(4))

@main def listMapLambda(): Unit =
  val l = List(1, 2, 3, 4, 5)
  val result = l.map(x => x * 2) // why used x in lambda coz map is used to iterate each element of a list l
  // and names that element with x and then adds that x value to 2

  println(result)

// output--> List(2, 4, 6, 8, 10) why list coz map use toh return new list as a result
//map() applies a function to each element of a collection and returns a new collection of the same shape.


//shorthand lambda

@main def shortHandLambda(): Unit =
  val list = List(1, 2, 3, 4, 5, 6, 7, 8)
  // println(list.map(x => x * 7))
  println(list.map(_ * 7)) //shorthand syntax for lambdas given on line 56 instead of x=>x wrote _underscore

  /* Higher Order Functions*/

  def square(x: Int) = x * x

  //def process(number, action) = action(number)
  def process(n: Int, a: Int => Int) = a(n)


