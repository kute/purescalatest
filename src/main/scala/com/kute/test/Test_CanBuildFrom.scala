package com.kute.test

import scala.collection.generic.CanBuildFrom
import scala.collection.immutable.BitSet
import scala.collection.mutable

/**
 * Created by kute on 2017/6/28.
 */
object Test_CanBuildFrom {

  def main(args: Array[String]) {


    implicit val backBitSet = new CanBuildFrom[Set[Long], Int, BitSet]{
      override def apply(from: Set[Long]): mutable.Builder[Int, BitSet] = {
        BitSet.newBuilder
      }

      override def apply(): mutable.Builder[Int, BitSet] = {
        BitSet.newBuilder
      }
    }

//    scala.collection.immutable.BitSet = BitSet(42, 84, 126)
    val bits = BitSet( 42, 84, 126 )

//    scala.collection.immutable.SortedSet[Long] = TreeSet(21, 42, 63)
    val aintBits = bits.map( _ / 2L )

//    scala.collection.immutable.SortedSet[Int] = TreeSet(21, 42, 63)
    val bitsAgain = aintBits.map( _.toInt )
    print(bitsAgain.getClass)

    print(bitsAgain)

  }

}
