scalaVersion := "2.9.2"

version := "0.1-SNAPSHOT"

name := "sbtkeysbot"

organization := "com.github.xuwei-k"

homepage := Some(url("https://github.com/xuwei-k/sbtkeysbot"))

externalResolvers ~= { _.filterNot{_.name.contains("Scala-Tools")} }

resolvers ++= Seq(
  "https://oss.sonatype.org/content/repositories/releases"
 ,"http://maven.twttr.com"
 ,"http://twitter4j.org/maven2"
).map{u => u at u}

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "2.2.5"
 ,"com.twitter" % "util-eval_2.9.1" % "4.0.1"
 ,"org.specs2"  %% "specs2" % "1.10" % "test"
)

scalacOptions += "-deprecation"

assemblySettings

initialCommands in console :=
  Seq(
    "com.twitter.conversions.time","com.twitter.util"
  ).map{p =>
    "import " + p + "._;"
  }.mkString("\n")

AssemblyKeys.jarName in AssemblyKeys.assembly <<= (name,version){(name,version) =>
  val df = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm-ss")
  <x>{name}-{df.format(new java.util.Date)}-{version}.jar</x>.text
}

