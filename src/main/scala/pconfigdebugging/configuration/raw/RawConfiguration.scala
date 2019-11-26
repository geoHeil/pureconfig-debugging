// Copyright (C) 2019 Datascience Team
package pconfigdebugging.configuration.raw

import pconfigdebugging.configuration._

trait Thing1 extends BaseConfiguration {
  def thing1: Foo3
}

trait Thing2 extends BaseConfiguration {
  def thing2: Foo3
}

trait Thing3 extends BaseConfiguration {
  def thing3A: Foo3

  def thing3B: Foo3

  def ting3C: Foo3

}

trait FooDataSource9 extends BaseConfiguration {
  def thing4a: Foo2
  def thing4b: Foo2
  def thing4c: Foo2
}
trait FooDataSource10 extends BaseConfiguration {
  def thing5: Foo2
}
trait FooDataSource17 extends BaseConfiguration {
  def thing6: Foo2
}

trait BaseWithSomeThings
    extends Thing1
    with Thing2
    with Thing3

trait BaseSomeOtherThings extends BaseConfiguration {
  def thingFooSome: String
}

trait Thing7 extends BaseSomeOtherThings {
  def thing7: Foo2
}

trait Thing8 extends BaseSomeOtherThings {
  def thing8: Foo2
}

trait Thing9 extends BaseSomeOtherThings {
  def thing9: Foo2
}

trait Thing10 extends BaseConfiguration {
  def thing10: Foo3
}

trait FooDataSource5 extends BaseConfiguration {
  def fooSource5: Foo3
}

trait FooDataSource4 extends BaseConfiguration {
  def fooSource4: Foo3
}

trait FooDataSource2 extends BaseConfiguration {
  def fooSourcexx: DataSourceNoPartition
}

trait SomeMoreFoo extends BaseSomeOtherThings {
  def fooSourceSomeMore: Foo2
}

trait FooBase
    extends Thing7
    with Thing8
    with Thing9
    with SomeMoreFoo

trait FooDataSource6 extends BaseConfiguration {
  def otherSourceBaz: Foo3
}

final case class Foo1(fooSomeA: Int,
                      fooSomeB: Int,
                      fooSomeC: Seq[(Int, Double)])
trait FooDataSource3 extends BaseConfiguration {
  val fooSomeXXA: Foo3
  val fooSomeXXB: Foo1

}

trait FooDataSource7 extends BaseConfiguration {
  val source7Foo: Foo3
}

trait FooDataSource8 extends BaseConfiguration {
  val source8bar: Foo3
}

trait FooDataSource14 extends BaseConfiguration {
  def first: Foo3
  def second: Foo3
  def third: Foo3
}

trait FooDataSource16 extends BaseConfiguration {
  def fourth: Foo2
}

trait FooDataSource11 extends BaseConfiguration {
  def eleventh: Foo2
}
trait FooDataSource12 extends BaseConfiguration {
  def twelth: Foo2
}
trait FooDataSource13 extends BaseConfiguration {
  def tihirteenth: Foo2
}

trait Checkpointable {
  def checkpointPath: String
}

trait FooDataSource15 {
  def fooSource15a: Foo3
  def fooSource15b: Foo2
  def fooSource16c: Foo3
}

trait AllDataSource
    extends Thing7
    with Thing8
    with Thing9
    with Thing10
    with SomeMoreFoo
    with FooDataSource6
    with FooDataSource3
    with FooDataSource5
    with FooDataSource2
    with FooDataSource4
    with FooDataSource7
    with FooDataSource8
    with FooDataSource17
    with FooDataSource10
    with BaseWithSomeThings
    with FooDataSource14
    with FooDataSource11
    with FooDataSource12
    with FooDataSource13
