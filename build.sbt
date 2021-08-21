name := "scalaui text editor"

scalaVersion := "2.13.6"

enablePlugins(ScalaNativePlugin)

nativeLinkingOptions := Seq(
  s"-L${baseDirectory.value}/native-lib"
)

libraryDependencies += "it.lolgab" %%% "scalaui" % "0.0.2"
libraryDependencies += "com.outr" %%% "reactify" % "4.0.7"

//nativeMode := "release" //had to comment this out to keep it from hanging during build
