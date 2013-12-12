package net.lockney

import org.scalatest._

class PersonSpec extends FlatSpec with Matchers {
  "A Person" should "allow setting a new name" in {
    val p = new Person("Some guy")
    p.setName("Thomas")
    p.getName should be ("Thomas")
    p.getName should not be ("Some guy")
  }

  "A Person" should "return name when calling toString" in {
    val p = new Person("Thomas")
    p.toString should be ("Thomas")
  }
}