package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

import com.iexpertos.encriptor.charcrypter.CharCrypter;
import com.iexpertos.encriptor.charcrypter.CharCrypterConfigurableFactory;

public class Encriptor {

	private CharCrypter charCrypterNumbers;
	private CharCrypter charCrypterSentence;
	private CharCrypterConfigurableFactory charCrypterSelectedCharsFactory;

	public String cryptWord(String word) {
		validateInput(word);
		return cryptSentence(word);
	}

	public String cryptWordToNumbers(String word) {
		validateInput(word);
		return crypt(word, charCrypterNumbers);
	}

	public String cryptWord(String word, String charsToReplace) {
		validateInput(word);
		CharCrypter charCrypterSelectedChars = 
				charCrypterSelectedCharsFactory.makeCharCrypter(charsToReplace);
		return crypt(word, charCrypterSelectedChars);
	}

	public String cryptSentence(String sentence) {
		return crypt(sentence, charCrypterSentence);
	}

	private String crypt(String stringToCrypt, CharCrypter charCrypter) {
		StringBuilder newWord = new StringBuilder();
		for (char charToCrypt : stringToCrypt.toCharArray()) {
			newWord.append(charCrypter.cryptChar(charToCrypt));
		}
		return newWord.toString();
	}

	private void validateInput(String word) {
		if (word.contains(" "))
			throw new InvalidParameterException();
	}
	
	public void setCharCrypterNumbers(CharCrypter charCrypterNumbers) {
		this.charCrypterNumbers = charCrypterNumbers;
	}

	public void setCharCrypterSentence(CharCrypter charCrypterSentence) {
		this.charCrypterSentence = charCrypterSentence;
	}

	public void setCharCrypterSelectedCharsFactory(CharCrypterConfigurableFactory charCrypterSelectedCharsFactory) {
		this.charCrypterSelectedCharsFactory = charCrypterSelectedCharsFactory;
	}
}
