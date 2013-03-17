package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

public class Encriptor {

	public String cryptWord(String word) {
		validateInput(word);
		return cryptSentence(word);
	}

	public String cryptWordToNumbers(String word) {
		validateInput(word);

		char[] wordArray = word.toCharArray();
		StringBuilder newWord = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			int charValue = wordArray[i];
			newWord.append(String.valueOf(charValue + 2));
		}

		return newWord.toString();
	}

	public String cryptWord(String word, String charsToReplace) {
		validateInput(word);
		char[] wordArray = word.toCharArray();
		char[] replacement = charsToReplace.toCharArray();
		char[] result = wordArray.clone();
		for (int i = 0; i < wordArray.length; i++) {
			if (isCharInCharsToReplace(wordArray[i], replacement)){
					int charValue = wordArray[i];
					result[i] = (char) (charValue + 2);
			}
		}
		return String.valueOf(result);
	}

	private boolean isCharInCharsToReplace(char theChar, char[] replacement) {
		for (int j = 0; j < replacement.length; j++) {
			if (replacement[j] == theChar)
				return true;
		}
		return false;
	}

	public String cryptSentence(String sentence) {
		char[] sentenceArray = sentence.toCharArray();
		StringBuilder newWord = new StringBuilder();
		for (int i = 0; i < sentence.length(); i++) {
			int charValue = sentenceArray[i];
			newWord.append( String.valueOf((char) (charValue + 2)) );
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
