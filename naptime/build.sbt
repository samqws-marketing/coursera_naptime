name := "naptime"

libraryDependencies ++= Seq(
  courierRuntime,
  governator,
  guice,
  guiceMultibindings,
  jodaTime,
  jodaConvert,
  playJson,
  scalaGuice,
  scalaLogging,
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  junit,
  junitInterface,
  scalatest,
  mockito
)

org.coursera.courier.sbt.CourierPlugin.courierSettings
