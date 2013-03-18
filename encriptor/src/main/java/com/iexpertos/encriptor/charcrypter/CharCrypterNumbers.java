package com.iexpertos.encriptor.charcrypter;

public class CharCrypterNumbers implements CharCrypter {

	@Override
	public String cryptChar(char charToCrypt) {
		return String.valueOf((int) charToCrypt + 2);
	}

}
