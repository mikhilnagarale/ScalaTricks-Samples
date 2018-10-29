class Circle{
var radius = 0 
private var dim=0  
val x=0  
private var c_thickness = 0
  
def draw ={println("Drawing a circle of radius "+radius)
          println("the diameter of the circle is "+dim)}
def thickness = c_thickness
def thickness_=(t:Int) = {c_thickness=t}  
  
}

val c = new Circle() //Default constructor provided by Scala
println(c.radius)
c.radius=10
println(c.radius)
c.draw
println(c.x)
println(c.thickness)
c.thickness=30
println(c.thickness)
//-------------------------------------------------------
//class definition with a primary constructor
class Box(var w:Int,var h:Int,var d:Int){
  //Auxiliary constructor
  def this()={
    this(1,1,1)
  }	

  def this(w:Int,h:Int)={
    this(w,h,1)
  }
  def showBox = {
    println(s"width=$w height=$h depth=$d")
  }
}

val b = new Box(1,2,3)
b.showBox

val e = new Box()
e.showBox

val f = new Box(3,4)
f.showBox

--------------object in scala (Singleton Class/object)-------------------
//Use of object in Scala
//1) To implement static methods in scala class
//2) To implement singletone design pattern  -- Singletone design pattern in object oriented programming is use to create single object of any class
//Which can be used everywhere without re-instentiating the class again & again . Eg- Creating Singleton class for utility methods or 
//Creating Singleton class for loading property file & reading properties which can be used in all modules whithout creating new objects for every module.

object testSingleton{
  println("Hello Singleton First Use....")
  
  def sayHello = {println("Hello!")}
}


testSingleton.sayHello
testSingleton.sayHello
testSingleton.sayHello

--------------apply method-------------------------------------------------
//Apply method is default method called in any class when we don't pass the method name
//In Below example when we call the myList(2) then it internally called myList(2)
//Apply methos can be defined in class as well as objects in Scala.
val myList = List("India","America","China","Japan")
println(myList(1))
println(myList(3))
println(myList.apply(2))
println(myList.apply(3))


