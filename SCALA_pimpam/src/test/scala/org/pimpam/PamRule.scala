package org.pimpam

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PamRule extends FunSuite with ShouldMatchers {

  test("game with 5 should return pam") {
    game.play(5) should be ("pam")    
  }

  test("game with 15 should return pam") {
    game.play(25) should be ("pam")    
  }
}
