package com.iexpertos.encriptor;

import com.iexpertos.encriptor.charcrypter.CharCrypterNumbers;
import com.iexpertos.encriptor.charcrypter.CharCrypterSelectedCharsFactory;
import com.iexpertos.encriptor.charcrypter.CharCrypterSentence;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Encriptor encriptor = new Encriptor();
		encriptor.setCharCrypterNumbers(new CharCrypterNumbers());
		encriptor.setCharCrypterSentence(new CharCrypterSentence());
		encriptor.setCharCrypterSelectedCharsFactory(new CharCrypterSelectedCharsFactory());
		
		System.out.println("1:" + encriptor.cryptWord("hola"));
		System.out.println("2:" + encriptor.cryptWordToNumbers("hola"));
		System.out.println("3:" + encriptor.cryptWord("hola", "o"));
		System.out.println("4:" + encriptor.cryptSentence("hola, que tal estas?"));
		encriptor.printWords("hola, que tal estas?");

	}

}
