package com.example

import com.typesafe.config.{Config, ConfigFactory}
import pureconfig.loadConfigOrThrow


package object config {

  private val config: Config       = ConfigFactory.load()
  val actorSystemName: String      = config.getString("akka.system.name")
  val appConfig: ApplicationConfig = loadConfigOrThrow[ApplicationConfig](config)

  case class ApplicationConfig(
    application: Application,
  )

  case class Application(
    host: String,
    port: Int
  )
}
