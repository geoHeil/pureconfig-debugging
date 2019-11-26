package pconfigdebugging

import pconfigdebugging.other.bar.OtherConfigCase

case class ConfigFoo(foo:String, bar:Int)
case class ConfigComplex(foo:String, bar:Int, baz:Seq[OtherConfigCase])