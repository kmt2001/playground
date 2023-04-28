package firstevaluation


object Playground extends App {

  //method
  def add(x:Int, y:Int): Int = x+y

  // function
  val addFunction(a:Int)(b:Int): Int = a + b

  //closure

  val c: Int = 5

  def addOneWithC(number: Int): Int = {
    c + 1
  }

  println(addOneWithC(2))

  // implicit example
  def add(x:Int)(implicit y: Int): Int = {
    x+y
  }

  implicit val y  = 2

  println(add(2))

  // difference b/w find and filter
  val mylist = List(1,2,3,4,5)
  val evenList = mylist.filter(_ % 2 == 0)
  val evenListFind = mylist.find(_ % 2 == 0)
  println(evenList)
  println(evenListFind)


  // Future Example
  def addFuture(num1: Int, num2: Int): Future[Int] = Future {
    Thread.sleep(5000)

    Future.successful(num1 + num2)
  }

  val future1 = Future[2]
  val future2 = Future[3]



  //map and flatmap

  val mapResult = mylist.map(_ * 2)
  println(mapResult)

  val mylist2 = List(List(1,2,3,4,5))
  val flatmapResult = mylist2.flatMap(x => mylist)
  println(flatmapResult)

  //Pattern Matching Example
  def checkUser(id: Int): Option[String] = {
    if (id == 18) Some("admin") else None
  }

  checkUser(19) match {
    case Some("admin") => println("authorised")
    case None => println("unauthorised")
  }
  


}
