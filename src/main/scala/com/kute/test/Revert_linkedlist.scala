package com.kute.test

/**
 * Created by kute on 2017/5/25.
 */

case class Node(val value: Int, val next: Node)

object Revert_linkedlist {

  def main(args: Array[String]) {

    val cur = Node(2, null)

    val head = Node(1, cur)

    println(head.value, head.next.value)

  }



}
