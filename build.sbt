name := """play-scala"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala, RpmPlugin)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

maintainer in Linux := "Deepak Mohanakrishnan <deepak_mohanakrishnan@cable.com>"

packageSummary in Linux := "Simple hello world play app"

packageDescription := "Simple play app to showcase buidling RPM and storing the build artifact in Tuppum DFS"

rpmRelease := "1"

rpmVendor := "comcast.com"

rpmGroup := Some("Development")

rpmUrl := Some("http://github.com/example/server")

rpmLicense := Some("Apache v2")

