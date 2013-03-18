package com.iexpertos.encriptor.charcrypter;

public class CharCrypterSelectedCharsFactory implements CharCrypterConfigurableFactory {

	@Override
	public CharCrypterConfigurable makeCharCrypter() {
		return new CharCrypterSelectedChars();
	}

}
