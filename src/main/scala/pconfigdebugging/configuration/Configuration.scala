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

final case class CsvFileDataSource(path: String, delimiter: String)

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

case class DataOutput(override val db: String,
                      override val table: String,
                      numberRecordsPerPartition: Option[Int])
    extends Db

case class StatisticsTable(override val db: String,
                           override val table: String,
                           partitionColumn: String,
                           partitionValue: Option[String],
                           columns: Option[Seq[String]])
    extends Db