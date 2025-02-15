
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "play-template"
  )
  .enablePlugins(PlayScala)

resolvers += "HMRC-open-artefacts-maven2" at "https://open.artefacts.tax.service.gov.uk/maven2"

libraryDependencies ++= Seq(
  "uk.gov.hmrc.mongo"      %% "hmrc-mongo-play-28"   % "0.63.0",
  guice,
  "org.scalatest"          %% "scalatest"               % "3.2.15"             % Test,
  "org.scalamock"          %% "scalamock"               % "5.2.0"             % Test,
  "org.scalatestplus.play" %% "scalatestplus-play"   % "5.1.0"          % Test,
  "com.typesafe.play" %% "play-ws" % "2.8.8" %Test,
  "com.typesafe.play" %% "play-json" % "2.9.2" %Test
)
libraryDependencies += "com.typesafe.play" %% "play-ws" % "2.8.8"
libraryDependencies += ("org.typelevel"                %% "cats-core"                 % "2.3.0")
libraryDependencies += ws
  "org.scalatestplus.play" %% "scalatestplus-play"   % "5.1.0"          % Test
)

libraryDependencies ++= Seq(
  "uk.gov.hmrc.mongo"      %% "hmrc-mongo-play-28"   % "0.63.0",
  guice,
  "org.scalatest"          %% "scalatest"               % "3.2.15"             % Test,
  "org.scalamock"          %% "scalamock"               % "5.2.0"             % Test,
  "org.scalatestplus.play" %% "scalatestplus-play"   % "5.1.0"          % Test
)
