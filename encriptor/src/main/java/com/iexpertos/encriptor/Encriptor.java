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
		for (char charValue : word.toCharArray()) {
			String newString = String.valueOf((int) charValue + 2);
			newWord.append(newString);
		}
		return newWord.toString();
	}

	public String cryptWord(String word, String charsToReplace) {
		validateInput(word);
		StringBuilder newWord = new StringBuilder();
		for (char charValue : word.toCharArray()) {
			String newString = transformCharIfInCharsToReplace(charValue,
					charsToReplace);
			newWord.append(newString);
		}
		return newWord.toString();
	}

	public String cryptSentence(String sentence) {
		StringBuilder newWord = new StringBuilder();
		for (char charValue : sentence.toCharArray()) {
			String newString = String.valueOf((char) ((int) charValue + 2));
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
