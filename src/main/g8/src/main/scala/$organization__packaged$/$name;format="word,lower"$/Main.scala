package $organization$.$name;format="word,lower"$

import org.sgine.lwjgl.DesktopApp

object Main extends DesktopApp {
  val hello: $name$Screen = new $name$Screen

  activeScreens.add(hello)
}
