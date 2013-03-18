package com.iexpertos.encriptor.charcrypter;

public class CharCrypterSentence implements CharCrypter {

	@Override
	public String cryptChar(char charToCrypt) {
		return String.valueOf((char) ((int) charToCrypt + 2));
	}

}
