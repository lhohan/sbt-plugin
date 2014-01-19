import sbt.{TaskKey, Plugin}

/**
 * User: hanlho
 * DateTime: 19/01/14 13:34
 */
object SbtPluginPlugin extends Plugin {

  val sayHello = TaskKey[Unit]("say hello")

  sayHello := {
    println("hello from sbt-plugin!")
  }


  // a group of settings ready to be added to a Project
  // to automatically add them, do
  val pluginSettings = Seq(
    sayHello
  )

}
