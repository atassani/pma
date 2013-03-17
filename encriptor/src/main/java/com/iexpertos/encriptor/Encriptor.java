package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

public class Encriptor {

	public String cryptWord(String word) {
		validateInput(word);
		return cryptSentence(word);
	}

	public String cryptWordToNumbers(String word) {
		validateInput(word);
		return crypt(word, new CharCrypterNumbers());
	}

	public String cryptWord(String word, String charsToReplace) {
		validateInput(word);
		CharCrypterSelectedChars charCrypter = new CharCrypterSelectedChars();
		charCrypter.setCharsToReplace(charsToReplace);
		return crypt(word, charCrypter);
	}

	public String cryptSentence(String sentence) {
		return crypt(sentence, new CharCrypterSentence());
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
