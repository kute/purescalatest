package com.kute.test.scalatest

import org.scalatest.FunSpec

/**
 * Created by kute on 2017/7/6.
 */
class FunSpecTest extends FunSpec{

  describe("A Set") {
    describe("when empty") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }

      it("should produce NoSuchElementException when invoking") {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }

}
