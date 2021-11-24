name         := "akka-http-rpi"
version      := "0.0.1"
scalaVersion := "2.12.8"

val akkaVersion           = "2.6.8"
val akkaHttpVersion       = "10.2.0"
val postgresVersion       = "42.2.5"
val h2Version             = "1.4.192"
val akkaHttpJson4sVersion = "1.25.2"
val macwireVersion        = "2.4.1"
val pureConfigVersion     = "0.9.0"
val logbackClassicVersion = "1.2.3"
val scalaTestVersion      = "3.1.2"

libraryDependencies ++= Seq(
    "com.typesafe.akka"        %% "akka-stream"          % akkaVersion,
    "com.typesafe.akka"        %% "akka-http"            % akkaHttpVersion,
    "org.postgresql"           %  "postgresql"           % postgresVersion,
    "com.h2database"           %  "h2"                   % h2Version,
    "de.heikoseeberger"        %% "akka-http-json4s"     % akkaHttpJson4sVersion,
    "com.softwaremill.macwire" %% "macros"               % macwireVersion         % "provided",
    "com.github.pureconfig"    %% "pureconfig"           % pureConfigVersion,
    "ch.qos.logback"           %  "logback-classic"      % logbackClassicVersion,
    "com.typesafe.akka"        %% "akka-http-testkit"    % akkaHttpVersion        % Test,
    "com.typesafe.akka"        %% "akka-stream-testkit"  % akkaVersion            % Test,
    "org.scalatest"            %% "scalatest"            % scalaTestVersion       % Test
)


