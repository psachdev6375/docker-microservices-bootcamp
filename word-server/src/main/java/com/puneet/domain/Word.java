/*
 * @author psachdev
 */
package com.puneet.domain;

/**
 * The Class Word.
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
	 * Sets the word.
	 *
	 * @param word the new word
	 */
	public void setWord(String word) {
		this.word = word;
	} 
	
}
