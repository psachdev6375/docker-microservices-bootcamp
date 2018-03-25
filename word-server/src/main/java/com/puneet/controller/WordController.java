/*
 * @author psachdev
 */
package com.puneet.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.puneet.domain.Word;

/**
 * The Class WordController.
 */
@RestController
@ConfigurationProperties(prefix="word-server")
public class WordController {

/** The words. */
//	@Value("${words}") String words;
	String words;
	
	/**
	 * Gets the word.
	 *
	 * @return the word
	 */
	@RequestMapping("/")
	public @ResponseBody Word getWord(){
		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		return new Word(wordArray[i]);
	}

	/**
	 * Gets the words.
	 *
	 * @return the words
	 */
	public String getWords() {
		return words;
	}

	/**
	 * Sets the words.
	 *
	 * @param words the new words
	 */
	public void setWords(String words) {
		this.words = words;
	}
	
}
