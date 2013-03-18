package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

public class Encriptor {

	private CharCrypter charCrypterNumbers;
	private CharCrypter charCrypterSentence;

	public Encriptor() {
		charCrypterNumbers = new CharCrypterNumbers();
		charCrypterSentence = new CharCrypterSentence();
	}
	
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
		CharCrypterConfigurable charCrypterSelectedChars = new CharCrypterSelectedChars();
		charCrypterSelectedChars.configure(charsToReplace);
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

	public String[] getWords(String sentence) {
		return sentence.split(" ");
	}

	public void printWords(String sentence) {
		String[] words = getWords(sentence);
		for (String word : words) {
			System.out.print("<" + word + ">");
		}
	}

	private void validateInput(String word) {
		if (word.contains(" "))
			throw new InvalidParameterException();
	}
}
