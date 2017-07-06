package com.kute.test.scalatest

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kute on 2017/7/6.
 *
 * http://www.scalatest.org/user_guide/using_matchers
 *
 */
class FlatSpecTest extends FlatSpec with Matchers{

  "An emtpy Set" should "have size 0" in {
    assert(Set.empty.size == 0)

    val size = Set.empty.size
    size should be (0)
    size shouldEqual 0
    size should equal (0)
    size shouldBe 0
    size should === (0)
  }

  it should "produce NoSuchElementException when invoking on an emtpy Set" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

  it should "normal" in {
    val result = 1 to 10 toList

    result should have length 10
    result should have size 10
  }

}
