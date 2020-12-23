ThisBuild / name := "Scala_Spark_Exercices"
ThisBuild / organization := "com.gitHub"
ThisBuild / version := "1.0"

ThisBuild / scalaVersion := "2.12.8"

// Properties build
lazy val sparkVersion = "2.4.5"
lazy val scalaTestVersion = "3.0.8"
lazy val scalaCheckVersion = "1.14.3"
lazy val scalaMeterVersion = "0.19"

// Apache Spark
val sparkCore = "org.apache.spark" %% "spark-core" % sparkVersion
val sparkSQl = "org.apache.spark" %% "spark-sql" % sparkVersion
val sparkStreaming = "org.apache.spark" %% "spark-streaming" % sparkVersion
val sparkHive = "org.apache.spark" %% "spark-hive" % sparkVersion

// Tests
val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion
val scalaCheck = "org.scalacheck" %% "scalacheck" % scalaCheckVersion

// Benchmarks
val scalaMeter = "com.storm-enroute" %% "scalameter" % scalaMeterVersion

lazy val commonSettings = Seq(
  libraryDependencies ++= Seq(sparkCore % Provided,
    sparkSQl % Provided,
    sparkStreaming % Provided,
    sparkHive% Provided),

  libraryDependencies += scalaTest % Test,
  libraryDependencies += scalaCheck % Test,

  libraryDependencies += scalaMeter % Test
)

lazy val root = (project in file("."))
  .settings(
    name := "Root Project"
  )

lazy val exercise = (project in file("exercise"))
  .settings(commonSettings : _*)
  .settings(
    name := "Exercises section"
  )

lazy val solution = (project in file("solution"))
  .settings(commonSettings : _*)
  .settings(
    name := "Solutions section"
  )
