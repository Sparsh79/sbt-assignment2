name := "assignment2"
version := "1.0."
scalaVersion := "2.12.6"
lazy val welcomeimpl = project.settings(libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test").dependsOn(util)
lazy val util = project
