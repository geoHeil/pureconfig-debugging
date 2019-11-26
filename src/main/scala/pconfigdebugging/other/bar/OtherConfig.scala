package pconfigdebugging.other.bar

import pconfigdebugging.configuration._
import pconfigdebugging.configuration.raw._

trait OtherConfig {

  def foo:String
  def bar:Int
}

case class OtherConfigCase(override val foo:String, override val bar:Int, baz:String,

                           bar1:Seq[String],
                           bar2:Seq[String],
                           bar3:Seq[String],
                           bar4:Seq[String],
                           bar5:Seq[String],
                           bar6:Seq[String],
                           f1:OneMore,
                           f2:Seq[OneMore],
                           f3:OneMore,
                           f4:OneMore,
                           f5:OneMore,
                           f6:OneMore,
                           f7:OneMore,
                           f8:OneMore,
                           f9:OneMore,
                           f10:OneMore,
                           f11:OneMore
                          ) extends OtherConfig


final case class ExtremelyComplexConfig(
                                         a: Long,
                                         b: String,
                                         c: String,
                                         d: Int,
                                         e: String,
                                         f: String,
                                         override val fooSomeXXB: Foo1,
                                         g: Option[Int],
                                         override val applicationName: String,
                                         override val thing7: Foo2,
                                         override val thing8: Foo2,
                                         override val thing9: Foo2,
                                         override val fooSourceSomeMore: Foo2,
                                         override val thing6: Foo2,
                                         override val thing5: Foo2,
                                         override val thing10: Foo3,
                                         override val fooSourcexx: DataSourceNoPartition,
                                         override val fooSomeXXA: Foo3,
                                         override val fooSource5: Foo3,
                                         override val source7Foo: Foo3,
                                         override val fooSource4: Foo3,
                                         override val otherSourceBaz: Foo3,
                                         override val thing4a: Foo2,
                                         override val thing4b: Foo2,
                                         override val thing4c: Foo2,
                                         override val source8bar: Foo3,
                                         override val first: Foo3,
                                         override val second: Foo3,
                                         override val third: Foo3,
                                         h: String,
                                         i: Option[String],
                                         j: Boolean,
                                         override val fooSource15a: Foo3,
                                         override val fooSource15b: Foo2,
                                         override val fooSource16c: Foo3,
                                         override val eleventh: Foo2,
                                         override val twelth: Foo2,
                                         override val tihirteenth: Foo2,
                                         override val fourth: Foo2,
                                         override val thingFooSome: String
                                            ) extends FooBase
  with Thing10
  with FooDataSource2
  with FooDataSource3
  with FooDataSource4
  with FooDataSource5
  with FooDataSource6
  with FooDataSource7
  with FooDataSource8
  with FooDataSource9
  with FooDataSource10
  with FooDataSource11
  with FooDataSource12
  with FooDataSource13
  with FooDataSource14
  with FooDataSource15
  with FooDataSource16
  with FooDataSource17