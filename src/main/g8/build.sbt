import android.Keys._

lazy val root = (project in file(".")).settings(android.Plugin.androidBuild)
  .settings(
    name := "$name$",
    scalaVersion := "$scala_version$",
    versionCode := Some(0),
    versionName := Some("0.1")
  )
