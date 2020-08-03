name := "algorithm"
organization := "algorithmia"
version := "0.1"
scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.mavenLocal
enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
  "com.algorithmia" %% "algorithmia-scala" % "1.0.1-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)