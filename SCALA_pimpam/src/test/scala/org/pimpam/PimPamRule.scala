package org.pimpam

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PimPamRule extends FunSuite with ShouldMatchers {

  test("game with 15 should return pimpam") {
    game.play(15) should be ("pimpam")    
  }
}
