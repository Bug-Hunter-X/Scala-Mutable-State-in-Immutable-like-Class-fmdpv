```scala
class MyClass(val name: String) {
  private var privateVar = 0

  def accessPrivateVar(): Int = privateVar
  def modifyPrivateVar(newValue: Int): Unit = {
    privateVar = newValue
  }
}

object Main extends App {
  val obj = new MyClass("Test")
  println(obj.accessPrivateVar) // Output: 0
  obj.modifyPrivateVar(10)
  println(obj.accessPrivateVar) // Output: 10
}
```