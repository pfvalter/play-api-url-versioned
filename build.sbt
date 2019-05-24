name := """play-api-url-versioned"""
organization := "pfvalter"

version := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

//Extra configuration to allow multiple and split route files:
scalacOptions ++= Seq("-feature", "-language:reflectiveCalls")

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test
