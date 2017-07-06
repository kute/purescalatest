name := "purescalatest"

version := "1.0"

scalaVersion := "2.11.11"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

logBuffered in Test := false

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

resolvers ++= Seq(
  "Artima Maven Repository" at "http://repo.artima.com/releases"
)
    