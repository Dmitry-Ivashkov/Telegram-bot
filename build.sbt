name := "telegram-bot"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq("org.augustjune" %% "canoe" % "0.5.1"
  , "org.scalatest" %% "scalatest" % "3.2.7" % Test)

Compile / run / mainClass := Some("org.MyTelegramBot.MyTelegramBotMain")