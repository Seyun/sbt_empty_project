name := "hello"

version := "1.0"

scalaVersion := "2.9.2"

resolvers += "Scala-Tools Nexus Repository for Releases" at "https://oss.sonatype.org/content/groups/scala-tools/"    

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.ning" % "async-http-client" % "1.7.5"