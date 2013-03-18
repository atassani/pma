package com.iexpertos.encriptor;

import com.iexpertos.encriptor.charcrypter.CharCrypterNumbers;
import com.iexpertos.encriptor.charcrypter.CharCrypterSelectedCharsFactory;
import com.iexpertos.encriptor.charcrypter.CharCrypterSentence;
import com.iexpertos.encriptor.validator.InputValidatorNoSpaces;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Encriptor encriptor = new Encriptor();
		encriptor.setCharCrypterNumbers(new CharCrypterNumbers());
		encriptor.setCharCrypterSentence(new CharCrypterSentence());
		encriptor.setCharCrypterSelectedCharsFactory(new CharCrypterSelectedCharsFactory());
		encriptor.setInputValidator(new InputValidatorNoSpaces());
		
		System.out.println("1:" + encriptor.cryptWord("hola"));
		System.out.println("2:" + encriptor.cryptWordToNumbers("hola"));
		System.out.println("3:" + encriptor.cryptWord("hola", "o"));
		System.out.println("4:" + encriptor.cryptSentence("hola, que tal estas?"));
		printWords("hola, que tal estas?");

	}
	
	public static void printWords(String sentence) {
		String[] words = sentence.split(" ");
		for (String word : words) {
			System.out.print("<" + word + ">");
		}
	}
}
