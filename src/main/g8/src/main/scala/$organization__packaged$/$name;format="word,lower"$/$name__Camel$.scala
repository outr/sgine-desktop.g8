package $organization$.$name;format="word,lower"$

import org.sgine._
import org.sgine.widget.Image

class $name$Screen extends Screen {
  this += new Image("sgine.png") {
    position.center := ui.width / 2.0
    position.middle := ui.height / 2.0
  }
}
