import sbt._
import Keys._

object MyPlugin extends Plugin {
  // configuration points, like the built in `version`, `libraryDependencies`, or `compile`
  // by implementing Plugin, these are automatically imported in a user's `build.sbt`
  val newTask = TaskKey[Unit]("A new task.")
  val newSetting = SettingKey[String]("A new setting.")

  // a group of settings ready to be added to a Project
  // to automatically add them, do
  val newSettings = Seq(
    newSetting := "test",
    newTask := println(newSetting)
  )

  override lazy val settings = Seq(commands += myCommand)

  lazy val myCommand =
    Command.command("hello") { (state: State) =>
      println("Hi!")
      state
    }

  // alternatively, by overriding `settings`, they could be automatically added to a Project
  // override val settings = Seq(...)
}
