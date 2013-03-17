package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

public class Encriptor {

	public String cryptWord(String word) {
		validateInput(word);
		return cryptSentence(word);
	}

	public String cryptWordToNumbers(String word) {
		validateInput(word);
		return crypt(word, null, new CharCrypterNumbers());
	}

	public String cryptWord(String word, String charsToReplace) {
		validateInput(word);
		return crypt(word, charsToReplace, null);
	}

	public String cryptSentence(String sentence) {
		return crypt(sentence, null, new CharCrypterSentence());
	}

	private String crypt(String stringToCrypt, String charsToReplace, CharCrypter charCrypter) {
		StringBuilder newWord = new StringBuilder();
		for (char charValue : stringToCrypt.toCharArray()) {
			String newString = null;
			if (charsToReplace != null)
				newString = transformCharIfInCharsToReplace(charValue, charsToReplace);
			else
				newString = charCrypter.cryptChar(charValue);
			newWord.append(newString);
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

	private boolean isCharInCharsToReplace(char theChar, String charsToReplace) {
		return charsToReplace.indexOf(theChar) >= 0;
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
}
