package net.lockney

//class Person(var name: String) {
//  def getName = name
//  def setName(newName: String) {
//    this.name = newName
//  }
//  override def toString = name
//}

object Main extends App {

  run()

  def run(): Unit = {
    val p = new Person("Thomas")
    println(p)
  }
}
