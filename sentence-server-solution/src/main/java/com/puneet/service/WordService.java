/*
 * @author psachdev
 */
package com.puneet.service;

import com.puneet.domain.Word;

/**
 * The Interface WordService.
 */
public interface WordService {

	/**
	 * Gets the subject.
	 *
	 * @return the subject
	 */
	Word getSubject();
	
	/**
	 * Gets the verb.
	 *
	 * @return the verb
	 */
	Word getVerb();
	
	/**
	 * Gets the article.
	 *
	 * @return the article
	 */
	Word getArticle();
	
	/**
	 * Gets the adjective.
	 *
	 * @return the adjective
	 */
	Word getAdjective();
	
	/**
	 * Gets the noun.
	 *
	 * @return the noun
	 */
	Word getNoun();

}
