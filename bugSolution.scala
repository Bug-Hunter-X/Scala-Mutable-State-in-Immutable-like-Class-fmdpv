```scala
class MyClass(val name: String, var privateVar: Int = 0) {
  def accessPrivateVar(): Int = privateVar
  def copyWithNewVar(newValue: Int): MyClass = {
    new MyClass(name, newValue)
  }
}

object Main extends App {
  val obj = new MyClass("Test")
  println(obj.accessPrivateVar) // Output: 0
  val updatedObj = obj.copyWithNewVar(10) 
  println(obj.accessPrivateVar) // Output: 0
  println(updatedObj.accessPrivateVar) // Output: 10
}
```