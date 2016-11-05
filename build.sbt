name := "scala-units"

organization := "com.persist"

version := "1.1.0"

scalaVersion := "2.12.0"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= Seq(
        "org.scala-lang" % "scala-reflect" % scalaVersion.value,
        "org.scalatest" %% "scalatest" % "3.0.0" % "test",
        "junit" % "junit" % "4.12" % "test"
)

publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

homepage := Some(url("https://github.com/nestorpersist/units"))

scmInfo := Some(ScmInfo(url("https://github.com/nestorpersist/units"), "scm:git@github.com:nestorpersist/units.git"))

pomExtra := (
  <developers>
    <developer>
      <id>johnnestor</id>
      <name>John Nestor</name>
      <email>nestor@persist.com</email>
      <url>http://http://www.persist.com</url>
    </developer>
  </developers>
)