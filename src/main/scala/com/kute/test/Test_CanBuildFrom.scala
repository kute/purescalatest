package com.kute.test

import scala.collection.generic.CanBuildFrom
import scala.collection.immutable.BitSet
import scala.collection.mutable

/**
 * Created by kute on 2017/6/28.
 *
 */
object Test_CanBuildFrom {

  def main(args: Array[String]) {


//    scala.collection.immutable.BitSet = BitSet(42, 84, 126)
    val bits = BitSet( 42, 84, 126 )

//    scala.collection.immutable.SortedSet[Long] = TreeSet(21, 42, 63)
    val aintBits = bits.map( _ / 2L )

//    隐式转换前：scala.collection.immutable.TreeSet
    println(aintBits.map( _.toInt ).getClass.getName)

    import com.kute.collections.CanBuildObject.canBuildBitSet
//    隐式转换后：scala.collection.immutable.BitSet$BitSet1
    println(aintBits.map( _.toInt ).getClass.getName)

    import com.kute.collections.CanBuildObject.canBuildArray
    println(aintBits.map( _.toDouble))

  }

}
