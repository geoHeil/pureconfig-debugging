// Copyright (C) 2019 Datascience Team
package pconfigdebugging.configuration

trait BaseConfiguration {
  def applicationName: String
}

sealed trait Db {
  def db: String

  def table: String
}

sealed trait DataSource

case class Foo3(db: String,
                table: String,
                partitionValue: Option[String])
    extends Db
    with DataSource

case class DataSourceNoPartition(db: String, table: String)
    extends Db
    with DataSource

sealed trait IntervalDataOutput {
  def intervalStart: Option[String]

  def intervalEnd: Option[String]
}

case class Foo2(override val db: String,
                override val table: String,
                partitionValue: Option[String],
                override val intervalStart: Option[String],
                override val intervalEnd: Option[String])
    extends Db
    with IntervalDataOutput
    with DataSource

