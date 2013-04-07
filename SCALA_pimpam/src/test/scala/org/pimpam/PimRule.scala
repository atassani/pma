package org.pimpam

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PimRule extends FunSuite with ShouldMatchers {

  test("game with 3 should return pim") {
    game.play(3) should be ("pim")    
  }
  
  test("game with 9 should return pim") {
    game.play(9) should be ("pim")    
  }
  
  test("game with 1 should return ''") {
    game.play(1) should be ("")    
  }
}
