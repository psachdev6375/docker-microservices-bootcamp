/*
 * @author psachdev
 */
package com.puneet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class ZuulProxyController.
 */
@Controller
public class ZuulProxyController {
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@RequestMapping("/")
	public String getAll() {
		return "Zuul is ON";
	}
}
