name := "hello_world_jar"

version := "0.1"

scalaVersion := "2.10.3"


libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0" % Provided


enablePlugins(JavaAppPackaging)

assemblyJarName in assembly := "spark-hello-world.jar"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}