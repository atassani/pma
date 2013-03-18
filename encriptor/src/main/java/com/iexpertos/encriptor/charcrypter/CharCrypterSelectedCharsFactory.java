package com.iexpertos.encriptor.charcrypter;

public class CharCrypterSelectedCharsFactory implements CharCrypterConfigurableFactory {

	@Override
	public CharCrypter makeCharCrypter(String charsToReplace) {
		return new CharCrypterSelectedChars(charsToReplace);
	}

}
