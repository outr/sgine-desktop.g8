name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

libraryDependencies += "org.sgine" %% "sgine-lwjgl" % "2.0.0-SNAPSHOT"

libraryDependencies += "com.badlogicgames.gdx" % "gdx-platform" % "1.7.2" classifier "natives-desktop"
