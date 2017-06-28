package com.kute.test

/**
 * Created by kute on 2017/5/17.
 */

//重命名引入
import java.util.{HashMap => javaHashMap}
import Array._


class Test {

  private[this] val x: Int = 9

}

object Test {

  def main(args: Array[String]): Unit = {
    printf(".........")

    val xmax, ymax = 100
    val t = (xmax, ymax)

    //~,&,|,^分别为取反，按位与与，按位与或，按位与异或运算

    for(x <- 1 to 10) {
    }
    for(x <- 1 until(10, 2)) {
    }
    for(i <- 1 to 10; j <- 2 until 30) {
      //多重循环
    }
    for(x <- 1 to 10 if x % 2 == 0; if x > 3) {
      //条件过滤
    }
    val list = for{
      x <- 1 to 10
      if x > 3
    } yield x
    println(list)

    val b = addInt()
    printStrings(b)

    val a = apply(addInt, 9)
    printStrings(a)

    val z = Array("Runoob", "Baidu", "Google")

    var c = new Array[String](4)

    val d = ofDim[Int](3, 4) // 多维数组
    for {
      i <- 0 to 2
      j <- 0 to 2
    } {
      d(i)(j) = j
    }
    for{
      i <- 0 to 2
      j <- 0 to 2
    } {
      print("====" + d(i)(j))
    }

    val l = List(1, 2, 3 , 4); l.head; l.tail
    val p = 2::3::4::Nil
    l:::p
    var x = List.fill(4)(10)
    var y = List.tabulate(4, 5)(_ * _)
    x = List.tabulate(4)(n => n * n)
    2 +: x
    x :+ 3
    val f = x contains 3
    var m: Map[String, Int] = Map("a" -> 3, "b" -> 4)
    m += "c" -> 5

    m.keys.foreach(println)
    m.keys foreach println

    val newm = m - "c"

    val value: Option[Int] = m get "b"

    value.getOrElse("default-value")

    m get "b" match {
        //模式匹配
      case Some(s) => println("===" + s)
      case None => println("nothing")
    }

    val tu = (1, 3, "a", 34.5)
    tu.productIterator.foreach(println)
    tu.productElement(3)
    tu.productPrefix

  }

  def printStrings(args: AnyVal *): Unit = {
    // * 可变参数列表
    for(x <- args) {
      print(x)
    }
  }

  def addInt(a: Int = 5): Int = 10 + a

  def layout[A](x: A) = "[" + x.toString() + "]"

  def apply(f: Int => Int, x: Int) = f(x)

  //匿名函数
  var inc = (x:Int, y: Int) => x * y + 1
  inc(8, 9)

  var userdir = ()=> println(System.getProperty("user.dir"))

  //柯里化
  def add(x: Int)(y: Int) = x + y  // 等价于  def add(x:Int)=(y:Int)=>x+y

  val add2 = add(8) _  //偏函数

  def a = add2(9)

  println(a)

  def add3(x: Int, y: Int) = x + y

  def add4 = add3(8, _: Int) //偏函数

  add4(8)

  // 在进入函数内部前，传值调用方式就已经将参数表达式的值计算完毕，而传名调用是在函数内部进行参数表达式的值计算的
  def addByName(a: Int, b: => Int) = a + b // call by name
  def addByValue(a: Int, b: Int) = a + b   //  call by value

}

object Drunkard {
  //最开始拥有的软妹币
  var money = 10
  //每天喝掉一个软妹币
  def drink: Unit = {
    money -= 1
  }
  //数钱时要算上被喝掉的软妹币
  def count: Int = {
    drink
    money
  }
  //每天都数钱
  def printByName(x: => Int): Unit = {
    for(i <- 0 until 5)
      println("每天算一算，酒鬼还剩" + x + "块钱！")
  }
  //第一天数一下记墙上，以后每天看墙上的余额
  def printByValue(x: Int): Unit = {
    for(i <- 0 until 5)
      println("只算第一天，酒鬼还剩" + x + "块钱！")
  }

  def main(args: Array[String]) = {
//    printByName(count)
    printByValue(count)
  }
}
