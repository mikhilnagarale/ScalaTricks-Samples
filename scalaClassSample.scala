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

val c = new Circle()
println(c.radius)
c.radius=10
println(c.radius)
c.draw
println(c.x)
println(c.thickness)
c.thickness=30
println(c.thickness)
