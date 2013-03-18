package com.iexpertos.encriptor;

import com.iexpertos.encriptor.charcrypter.CharCrypter;
import com.iexpertos.encriptor.charcrypter.CharCrypterConfigurableFactory;
import com.iexpertos.encriptor.validator.InputValidator;

public class Encriptor {

	private CharCrypter charCrypterNumbers;
	private CharCrypter charCrypterSentence;
	private CharCrypterConfigurableFactory charCrypterSelectedCharsFactory;
	private InputValidator inputValidator;

	public String cryptWord(String word) {
		inputValidator.validate(word);
		return cryptSentence(word);
	}

	public String cryptWordToNumbers(String word) {
		inputValidator.validate(word);
		return crypt(word, charCrypterNumbers);
	}

	public String cryptWord(String word, String charsToReplace) {
		inputValidator.validate(word);
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
	
	public void setCharCrypterNumbers(CharCrypter charCrypterNumbers) {
		this.charCrypterNumbers = charCrypterNumbers;
	}

	public void setCharCrypterSentence(CharCrypter charCrypterSentence) {
		this.charCrypterSentence = charCrypterSentence;
	}

	public void setCharCrypterSelectedCharsFactory(CharCrypterConfigurableFactory charCrypterSelectedCharsFactory) {
		this.charCrypterSelectedCharsFactory = charCrypterSelectedCharsFactory;
	}
	
	public void setInputValidator(InputValidator inputValidator) {
		this.inputValidator = inputValidator;
	}
}
