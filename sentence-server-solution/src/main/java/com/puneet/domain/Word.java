/*
 * @author psachdev
 */
package com.puneet.domain;

/**
 * 'Word' object is nicely represented in JSON over a regular String.
 */
public class Word {

	/** The word. */
	public String word;

	/**
	 * Instantiates a new word.
	 */
	public Word() {
		super();
	}	
	
	/**
	 * Instantiates a new word.
	 *
	 * @param word the word
	 */
	public Word(String word) {
		this();
		this.word = word;
	}

	/**
	 * Gets the word.
	 *
	 * @return the word
	 */
	public String getWord() {
		return word;
	}
	
	/**
	 * Gets the string.
	 *
	 * @return the string
	 */
	public String getString() {
		return getWord();
	}

	/**
	 * Sets the word.
	 *
	 * @param word the new word
	 */
	public void setWord(String word) {
		this.word = word;
	}
	
	
}
