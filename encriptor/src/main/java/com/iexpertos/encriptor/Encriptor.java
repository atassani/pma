package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

public class Encriptor {

	public String cryptWord(String word) {
		validateInput(word);
		return cryptSentence(word);
	}

	public String cryptWordToNumbers(String word) {
		validateInput(word);

		StringBuilder newWord = new StringBuilder();
		for (char charValue: word.toCharArray()) {
			newWord.append(String.valueOf((int)charValue + 2));
		}

		return newWord.toString();
	}

	public String cryptWord(String word, String charsToReplace) {
		validateInput(word);
		StringBuilder newWord = new StringBuilder();
		for (char charValue: word.toCharArray()) {
			if (isCharInCharsToReplace(charValue, charsToReplace)){
					newWord.append((char) (charValue + 2));
			} else {
				newWord.append(charValue);
			}
		}
		return newWord.toString();
	}

	private boolean isCharInCharsToReplace(char theChar, String charsToReplace) {
		return charsToReplace.indexOf(theChar) >= 0;
	}

	public String cryptSentence(String sentence) {
		StringBuilder newWord = new StringBuilder();
		for (char charValue: sentence.toCharArray()) {
			newWord.append( (char) ((int)charValue + 2) );
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
