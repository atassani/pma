package com.iexpertos.encriptor;

public class CharCrypterSelectedChars implements CharCrypterConfigurable {

	private String charsToReplace;
	
	@Override
	public String cryptChar(char charToCrypt) {
		return transformCharIfInCharsToReplace(charToCrypt, charsToReplace);
	}
	
	@Override
	public void configure(String charsToReplace) {
		this.charsToReplace = charsToReplace;
	}

	private String transformCharIfInCharsToReplace(char charValue, String charsToReplace) {
		String newString;
		if (isCharInCharsToReplace(charValue, charsToReplace)) {
			newString = String.valueOf((char) (charValue + 2));
		} else {
			newString = String.valueOf(charValue);
		}
		return newString;
	}

	private boolean isCharInCharsToReplace(char theChar, String charsToReplace) {
		return charsToReplace.indexOf(theChar) >= 0;
	}
}
