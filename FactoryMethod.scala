abstract class Room{
def bookingPrice:Double
def facilities:List[String]
def availibility:Int
def book(noOfRooms:Int)
}

object Room{

val STANDERD = 0
val DELUX = 1
val SUPER_DELUX = 2

private class standerdRoom extends Room{
 private var _availibility : Int=20
 override def bookingPrice = 70
 override def facilities = List("Bed","Washroom","fan")
 override def book(noOfRooms:Int) = {
   _availibility = _availibility - noOfRooms
  } 
 }

private class deluxRoom extends Room{
 private var _availibility : Int=10
 override def bookingPrice = 120
 override def facilities = List("Bed","Washroom","fan","AC")
 override def book(noOfRooms:Int) = {
  _availibility = _availibility - noOfRooms
  }
 }

private class superDeluxRoom extends Room{
 private var _availibility : Int=5
 override def bookingPrice = 250
 override def facilities = List("Bed","Washroom","fan","AC","Dinner")
 override def book(noOfRooms:Int) = {
   _availibility = _availibility - noOfRooms
  }
 }
 
 def apply(roomType:Int)={
  roomType match{
   case STANDERD => new standerdRoom()
   case DELUX => new deluxRoom()
   case SUPER_DELUX => new superDeluxRoom()
   case _ => new standerdRoom()
   }
  }
}
