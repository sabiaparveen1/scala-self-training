//syntax of scala method
//def methodName(method inout parameters):returnType=//method body


//create a sum method to add integers
def sum(a: Int, b: Int): Int = a + b

//create concatenate method to add string values
def concatenate(s1: String, s2: String): String = s1 + s2

//create multiline method with scala 2 and Scala mein last line automatically return hoti hai as under msg will return
def greet(name: String): String = {
  val msg = "hello " + name
  msg
}

//same above multiline method can be written in scala 3 by just removing the curly brackets

//create a method by giving default values to method parameters
def makeConnection(url: String, timeout: Int = 5000): Unit =
  println(s"$url, timeOut=$timeout")

//extension methods ->writing extension method for built in class "String"
extension (name: String)
  def welcomeMsg(): String =
    "Welcome" + name.capitalize

extension (i:Int)
  def addIntegerMthdToInt():Int=
    3+i

//calling all methods created above by creating a main method named runMethodSum
@main def runMethodSum(): Unit =
  val result = sum(9, 5)
  println(s"result after adding two integers $result")

  val result2 = concatenate("sabia", "parveen")
  println(s"result after adding two Strings $result2")

  // Scala mein last line automatically return hoti hai
  println(greet("sabia "))

  //calling method makeConnection without passing its default value i.e timeout coz it was passed in method declaration
  makeConnection("https://localhost")

  //calling the same method again by passing/overiding default paramter values
  makeConnection("https://localhost", 2500)

  //calling method by passing named paramters
  makeConnection(url = "https://localhost", timeout = 1400)

  //calling extension method
  println("ssabia".welcomeMsg())
  println(4.addIntegerMthdToInt())

/*important summary points
* 1. scala mein method ka return type agr hamne ni bhi dia toh scala khud smjh jata hai ke kya return type hai
* 2. scala mein method ke body mein jo last line hoti hai woh automatically return hojati hai
* 3. adding extension methods to existing class(i.e String, Int etc) and objects as well as to our custom classes*/