package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.iexpertos.encriptor.charcrypter.CharCrypterNumbers;
import com.iexpertos.encriptor.charcrypter.CharCrypterSelectedCharsFactory;
import com.iexpertos.encriptor.charcrypter.CharCrypterSentence;

public class EncriptorTest {

	private Encriptor encriptor;

	@Before
	public void setUp() {
		encriptor = new Encriptor();
		encriptor.setCharCrypterNumbers(new CharCrypterNumbers());
		encriptor.setCharCrypterSentence(new CharCrypterSentence());
		encriptor.setCharCrypterSelectedCharsFactory(new CharCrypterSelectedCharsFactory());
	}

	@Test
	public void cryptSentence() {
		String result = encriptor.cryptSentence("hello world!");
		Assert.assertEquals("jgnnq\"yqtnf#", result);
	}

	@Test
	public void cryptWord() {
		String result = encriptor.cryptWord("hello");
		Assert.assertEquals("jgnnq", result);
	}

	@Test(expected = InvalidParameterException.class)
	public void cryptWordContainsSpace() {
		encriptor.cryptWord("hello world");
	}

	@Test
	public void cryptWordMaxValue() {
		String result = encriptor.cryptWord("hello" + Character.MAX_VALUE);
		Assert.assertEquals("jgnnq" + (char) 1, result);
	}

	@Test
	public void cryptWordToNumbers() {
		String result = encriptor.cryptWordToNumbers("hello");
		Assert.assertEquals("106103110110113", result);
	}

	@Test(expected = InvalidParameterException.class)
	public void cryptWordToNumbersContainsSpace() {
		encriptor.cryptWordToNumbers("hello world");
	}

	@Test
	public void cryptWordToNumbersMaxValue() {
		String result = encriptor.cryptWordToNumbers("hello" + Character.MAX_VALUE);
		Assert.assertEquals("10610311011011365537", result);
	}

	@Test
	public void cryptWords() {
		String result = encriptor.cryptWord("hello", "world");
		Assert.assertEquals("hennq", result);
	}

	@Test(expected = InvalidParameterException.class)
	public void cryptWordsContainsSpace() {
		encriptor.cryptWord("hello world", "hello");
	}

	@Test
	public void cryptWordsNonExistentReplacement() {
		String result = encriptor.cryptWord("hello", "patata");
		Assert.assertEquals("hello", result);
	}

	@Test
	public void cryptWordsAllLettersInReplacement() {
		String result = encriptor.cryptWord("hello", "lohe");
		Assert.assertEquals("jgnnq", result);
	}
}
