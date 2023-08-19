scalaVersion := "3.0.0"

libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"

target := (ThisBuild / baseDirectory).value / "custom-target" / baseDirectory.value.name

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb",
)
