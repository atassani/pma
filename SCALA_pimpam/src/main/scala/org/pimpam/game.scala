package org.pimpam

object game {
  
	val divisorMessages = (3->"pim", 5->"pam") 

  
  	def play(number: Int) : String = {
  	  applyRule(number, 3, "pim") + applyRule(number, 5, "pam")
	}
  
  	private def applyRule(number: Int, divisor: Int, message: String) : String = {
  	  if (number % divisor == 0) message
  	  else ""
  	}
}