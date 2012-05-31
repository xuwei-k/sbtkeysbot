import sbt._

object Plugins extends Build {
  lazy val root = Project("root", file(".")) dependsOn(
    uri("git://github.com/sbt/sbt-assembly.git#d4e53e9abeaf0f71f599187bf227e6b4bf7a6579")
  )
}

