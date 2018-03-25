/*
 * @author psachdev
 */
package com.puneet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.puneet.service.SentenceService;



/**
 * The Class SentenceController.
 */
@Controller
public class SentenceController {

	/** The sentence service. */
	@Autowired SentenceService sentenceService;
	
	
	/**
	 * Display a small list of Sentences to the caller:.
	 *
	 * @return the sentence
	 */
	@RequestMapping("/sentence")
	public @ResponseBody String getSentence() {
		long start = System.currentTimeMillis();
		String output = 
			"<h3>Some Sentences</h3><br/>" +	  
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>"
			;
		long end = System.currentTimeMillis();
		return output + "Elapsed time (ms): " + (end - start);
	}

}
