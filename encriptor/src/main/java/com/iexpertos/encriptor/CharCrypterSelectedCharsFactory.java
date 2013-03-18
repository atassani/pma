package com.iexpertos.encriptor;

public class CharCrypterSelectedCharsFactory implements CharCrypterConfigurableFactory {

	@Override
	public CharCrypterConfigurable makeCharCrypter() {
		return new CharCrypterSelectedChars();
	}

}
