import scala.io.StdIn.readLine

 def HelloInteractive(): Unit =

  println("Please enter your name:")
  val name = readLine()
  println("Hello, " + name + "!")

  //Types of variables
  //1. Immutable variables
  val a = 1
  //a = 10

  //2. mutable variables
  var m = 1
  m = 8

  //Declaring variable types
  //1. Explicit declaration
  val b: Int = 4

  //2. Implicit declaration;  the compiler infers the type
  val c = 4

  // type Hierarchy
  val x = 10
  val y: Any = "Sabia"
  val z: Any = true

  if x < 0 then
    println("negative")


