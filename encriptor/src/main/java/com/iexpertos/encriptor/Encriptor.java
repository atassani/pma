package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

public class Encriptor {

	private static final int SENTENCE = 0;
	private static final int NUMBERS = 1;
	private static final int CHARS_TO_REPLACE = 2;

	public String cryptWord(String word) {
		validateInput(word);
		return cryptSentence(word);
	}

	public String cryptWordToNumbers(String word) {
		validateInput(word);
		return crypt(word, NUMBERS, null, null);
	}

	public String cryptWord(String word, String charsToReplace) {
		validateInput(word);
		return crypt(word, CHARS_TO_REPLACE, charsToReplace, null);
	}

	public String cryptSentence(String sentence) {
		return crypt(sentence, SENTENCE, null, new CharCrypterSentence());
	}
	
	private String crypt(String stringToCrypt, int type, String charsToReplace, CharCrypter charCrypter) {
		StringBuilder newWord = new StringBuilder();
		for (char charValue : stringToCrypt.toCharArray()) {
			String newString = null;
			switch (type) {
			case SENTENCE:
				newString = charCrypter.cryptChar(charValue);
				break;
			case NUMBERS:
				newString = String.valueOf((int) charValue + 2);
				break;
			case CHARS_TO_REPLACE:
				newString = transformCharIfInCharsToReplace(charValue,
						charsToReplace);
				break;
			}
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

	private String transformCharIfInCharsToReplace(char charValue,
			String charsToReplace) {
		String newString;
		if (isCharInCharsToReplace(charValue, charsToReplace)) {
			newString = String.valueOf((char) (charValue + 2));
		} else {
			newString = String.valueOf(charValue);
		}
		return newString;
	}
}
