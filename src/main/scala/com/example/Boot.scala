package com.example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import com.example.config.{actorSystemName, appConfig}
import org.slf4j.LoggerFactory
import scala.concurrent.ExecutionContext


object Boot extends App with Route {

  implicit val system: ActorSystem             = ActorSystem(actorSystemName)
  implicit val materializer: ActorMaterializer = ActorMaterializer()
  implicit val ec: ExecutionContext            = system.dispatcher

  // start a new HTTP server on port 8082 with our route as the handler
  Http().bindAndHandle(
    route, appConfig.application.host, appConfig.application.port) // TODO:  val bindingFuture = Http().newServerAt("0.0.0.0", 8082).bind(route)

  log.debug(s"Server online at http://${appConfig.application.host}:${appConfig.application.port}/")
  log.debug(s"Press RETURN to stop...")

}

trait Route {
  val log = LoggerFactory.getLogger(getClass)

  val route = path("") {
      get {
        complete {
          log.debug(s"Say hello to akka-http on Raspberry Pi")
          "Say hello to akka-http on Raspberry Pi"
        }
      }
    }
}
