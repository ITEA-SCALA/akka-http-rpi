name          := "akka-http-rpi"
version       := "0.0.1"
scalaVersion  := "2.12.8"

val akkaHttpVersion = "10.2.0"
val akkaVersion = "2.6.8"
val scalaTestVersion = "3.1.2"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
    "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion  % "test",
    "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion      % "test",
    "org.scalatest"     %% "scalatest"            % scalaTestVersion % "test"
)


