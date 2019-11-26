package pconfigdebugging.configuration

import pureconfig.{ConfigReader, ConfigSource}

object UtilsConfig {
  def loadConfiguration[T <: Product](implicit A: ConfigReader[T]): T = {
    val r = ConfigSource.default.load[T]
    r match {
      case Right(s) => s
      case Left(l) =>
        throw new Exception(
          s"Failed to start. There is a problem with the configuration: ${l}"
        )
    }
  }
}
