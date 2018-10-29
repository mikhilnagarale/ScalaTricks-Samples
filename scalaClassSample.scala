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
