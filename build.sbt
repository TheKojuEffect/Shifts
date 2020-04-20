lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .enablePlugins(JooqCodegenPlugin)
  .settings(
    name := "Shifts",
    version := "2.8.x",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      jdbc,
      evolutions,
      "org.postgresql" % "postgresql" % "42.2.12",
      "org.postgresql" % "postgresql" % "42.2.12" % "jooq-codegen",
      "org.playframework.anorm" %% "anorm" % "2.6.5",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
    ),
    scalacOptions ++= List("-encoding", "utf8", "-deprecation", "-feature", "-unchecked", "-Xfatal-warnings"),
    javacOptions ++= List("-Xlint:unchecked", "-Xlint:deprecation", "-Werror"),

    jooqCodegenStrategy := CodegenStrategy.Never,
    jooqCodegenConfig := baseDirectory.value / "conf/jooq-codegen.xml"
  )
