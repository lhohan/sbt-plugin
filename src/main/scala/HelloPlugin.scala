import sbt._

/**
 * User: hanlho
 * DateTime: 19/01/14 15:41
 */
object HelloPlugin extends Plugin {

  val helloSetting = settingKey[String]("An hello setting.")

  val helloTask = TaskKey[Unit]("say hello")

  sayHello := {
    println("hello " + helloSetting.value)
  }


  // a group of settings ready to be added to a Project
  // to automatically add them, do
  val helloSettings = Seq(
    helloSetting, helloTask
  )


}
