package exercise1

import spec.UnitSpec

class CountrySpec extends UnitSpec {

  val countriesToCheck = List(List("Usa","mexico","Brazil"),List("france","Spain","italy"),List("Wales","england","Scotland"))

  "Country" should {
    "find wales from three lists" in  {
      pending //use countriesToCheck
    }

    "not find ireland from three lists" in {
      pending //use countriesToCheck
    }

    "convert all countries to upper case and return one list" in {
      pending //use countriesToCheck
    }

    "convert all countries to lower case and return one list" in {
      pending //use countriesToCheck
    }

    "convert all countries to capital letters as first character and return one list" in {
      pending //use countriesToCheck
    }
  }
}