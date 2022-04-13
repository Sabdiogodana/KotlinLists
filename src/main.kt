fun main(){
 var colors = listOf("Blue","Red","Yellow")
  var streams = mutableListOf("Lisalab","AnitaB","Lovelace")
  streams.add("Akira")
    println(streams)
    val nums = listOf(21,20,19,18,22,22,25,21,22)
  println(nums.count())
  println(nums.size)
  println(nums.maxOrNull())
  println(nums.minOrNull())
  println(nums.first())
  println(nums.get(4))
  println(nums.lastIndexOf(22))
var sortedNums = nums.sorted()
  println(sortedNums)
  println(nums.sortedDescending())
  var x = Car("Toyota","Premio")
  var y =Car("Audi","A5")
  var z =Car("Nissan","Juke")
  var cars =listOf(x,y,z)
  println(cars)
  var sorted =cars.sortedBy { car -> car.model }
  println(sorted)
  var names = listOf("Abed","Elizabeth","Ephraim","Tanasha" )
  var l5 =names.filter { name-> name.length>5 }
   println(15)
  var a =person("Tsuma",23)
  var b =person("Sakina",18)
  var c =person("Esther",16)
  var d =person("Lvyne",24)
  var people = listOf(a,b,c,d)
  var adults =people.filter { person -> person.age>=18 }
  println(adults)

}

data class Car(var make:String,var model:String)
data class person(var name:String,var  age:Int)


