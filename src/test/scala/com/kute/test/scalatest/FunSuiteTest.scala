package com.kute.test.scalatest

import org.scalatest.FunSuite

/**
 * Created by kute on 2017/7/6.
 */
class FunSuiteTest extends FunSuite{

  test("A empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invokeing head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

}
