lazy val `hello-play-27` = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "hello-play-27",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatest" %% "scalatest" % "3.0.7" % "test"
    )
  )
