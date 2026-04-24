import OrderStatus.{Delivered, Pending, Shipped}
import PaymentType.{Card, Cash, UPI}
import Size.Small

import java.nio.file.attribute.UserPrincipal

// example of trait and class
trait Speaker:
  def speak(): String // abstract method

  def greet(): Unit = println("Hello greet function from Speaker trait") //concrete method

// This trait example is for showing mixing multiple behaviour in a class by using extends keyword
trait TailWagger:
  def startTail(): Unit = println("TailWagging")

class Dog extends Speaker, TailWagger:
  def speak(): String = "Barks as Woof"

class Cat extends Speaker:
  def speak(): String = "cat meowww"

//practice 3 example on line 48
enum OrderStatus:
  case Pending, Shipped, Delivered

//practice 5
enum Size:
  case Small, Medium, Large

case class Pizza(size: Size, price: Int)


//practice 4 Case class (Product Type)
case class Student(
                    name: String,
                    marks: Int)


//practice 6 Sum Type
enum PaymentType:
    case Cash, Card, UPI


@main def DomainModeling(): Unit =
  val d = Dog()
  val c = Cat()

  println(d.speak())
  println(c.speak())

  d.greet()
  d.startTail()


  //practice 2 Mutable class(OOP)
  class BankBalance(var balance: Int):
    def deposit(amount: Int): Unit =
      balance = balance + amount

    def show(): Unit =
      println(s"bank balance is $balance")


  val bankBal = BankBalance(1000)
  bankBal.deposit(500)
  bankBal.show()

  //practice 3 Enum + Match
  val status = Delivered
  status match
    case Pending => println("wait for the order")
    case Shipped => println("Order on the way")
    case Delivered => println("order recieved")


  //practice 4 Case class (Product Type)
  val std = Student("Ali", 200)
  println(std.name)
  println(std.marks)

  //copy method is used to reassign the value to case class fields i.e immutable update
  val std2 = std.copy(marks = 23)
  println(std2)

//practice 5 product type
  val p = Pizza(Small, 40)
  println(p)

//Practice 6 Sum type
  val paymentType= UPI
    paymentType match
        case Card => println("payment with card")
        case Cash => println("payment with cash")
        case UPI => println("payment with UPI")
