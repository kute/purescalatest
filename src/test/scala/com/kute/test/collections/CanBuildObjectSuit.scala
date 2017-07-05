package com.kute.test.collections

import org.scalatest.FunSuite

import scala.collection.immutable.BitSet

/**
 * Created by longbai on 2017/7/5.
 */
class CanBuildObjectSuit extends FunSuite{

  val bits = BitSet( 42, 84, 126 )

  val aintBits = bits.map( _ / 2L )

  test("test a norml class name") {
    val className = aintBits.map( _.toInt ).getClass.getName
    println(className)
    assert(className == scala.collection.immutable.TreeSet.getClass.getName)
  }

  test("treeset[Int] can map to BitSet[Int] back") {
    import com.kute.collections.CanBuildObject.canBuildBitSet
    val className = aintBits.map( _.toInt )(canBuildBitSet).getClass.getName
    println(className)
    assert(className == scala.collection.immutable.BitSet.getClass.getName)
  }

}
