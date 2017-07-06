package com.kute.test.scalatest

import org.scalatest.WordSpec

/**
 * Created by kute on 2017/7/6.
 */
class WordSpecTest extends WordSpec{

  "A Set" when {
    "empty" should {
      "have size 0" in {
        assert(Set.empty.size == 0)
      }

      "produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }

}
