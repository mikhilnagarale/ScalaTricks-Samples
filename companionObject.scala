class Graph  (path:String){
println("Loading the graph")
def getEdges=1234
def getVertex=2321
def persist(storageLevel:Int)={
println("returning the object for given storage level")}
def apply(x:Int)={println("Calling apply method in class!"+x)	  
  }	
 }

object Graph{
	val MEMORY_ONLY=0
	val DISK_ONLY=1
	val MEMORY_N_DISK=2
	def apply(p:String)={new Graph(p)}
}

