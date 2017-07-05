package com.kute.collections

import scala.collection.BitSet
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable

/**
 * Created by longbai on 2017/7/5.
 *
 * 1. 每个集合都在其伴生对象里提供了一个隐式的CanBuildFrom对象
 * 2. 创建好了目标类型的容器后，开始迭代当前容器执行f函数转换，并将结果填入目标容器
 *
 * CanBuildFrom[-From, -Elem, +To]
 * From: 原始数据类型
 * Elem: 经过变换后的元素的类型
 * To:将要转化为的数据类型
 */
object CanBuildObject {

  implicit val canBuildBitSet = new CanBuildFrom[Set[Long], Int, BitSet] {
    override def apply(from: Set[Long]): mutable.Builder[Int, BitSet] = {
      BitSet.newBuilder
    }
    override def apply(): mutable.Builder[Int, BitSet] ={
      BitSet.newBuilder
    }
  }

  implicit val canBuildArray = new CanBuildFrom[Set[Long], Double, Array[Double]]{
    override def apply(from: Set[Long]): mutable.Builder[Double, Array[Double]] = {
      mutable.ArrayBuilder.make[Double]
    }

    override def apply(): mutable.Builder[Double, Array[Double]] = {
      mutable.ArrayBuilder.make[Double]
    }
  }

}
