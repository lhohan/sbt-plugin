package eu.lhoest.sbtPlugin.hello


import sbt._
import Keys._
import Project.Initialize

/**
 * User: hanlho
 * DateTime: 19/01/14 15:41
 */
object HelloPlugin extends Plugin{


  val sayHello = TaskKey[Unit]("say hello")

  sayHello := {
    println("hello from sbt-plugin!")
  }


  // a group of settings ready to be added to a Project
  // to automatically add them, do
  val helloSettings = Seq(
    sayHello
  )


}
