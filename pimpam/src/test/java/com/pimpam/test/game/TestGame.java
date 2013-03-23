package com.pimpam.test.game;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.pimpam.game.Game;
import com.pimpam.game.Rule;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestGame {

	private Game game;
	
	@Mock
	Rule rule1;
	@Mock
	Rule rule2;
	
	private static final String MESSAGE_1 = "message1";
	private static final String MESSAGE_2 = "message2";

	private static final int IRRELEVANT_NUMBER = 1;

	List<Rule> ruleList;
	
	@Before
	public void setUp() {
		ruleList = new ArrayList<Rule>();
		game = new Game(ruleList);
	}

	@Test
	public void playWithSingleRuleReturnsMessage() {
		ruleList.add(rule1);
		when(rule1.apply(anyInt())).thenReturn(MESSAGE_1);
		assertEquals(MESSAGE_1, game.play(anyInt()));
	}

	@Test
	public void playWithTwoRulesReturnsOrderedConcatenatedMessages() {
		ruleList.add(rule1);
		ruleList.add(rule2);
		when(rule1.apply(anyInt())).thenReturn(MESSAGE_1);
		when(rule2.apply(anyInt())).thenReturn(MESSAGE_2);
		assertEquals(MESSAGE_1+MESSAGE_2, game.play(anyInt()));
	}

	@Test
	public void playWithTwoRulesAppliesTwoRulesWithProperParameter() {
		ruleList.add(rule1);
		ruleList.add(rule2);
		game.play(IRRELEVANT_NUMBER);
		verify(rule1).apply(IRRELEVANT_NUMBER);
		verify(rule2).apply(IRRELEVANT_NUMBER);
	}
}
