resolvers ++= DefaultOptions.resolvers(snapshot = true)

addSbtPlugin("com.typesafe.play" % "interplay" % "1.3.5")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.8")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")


