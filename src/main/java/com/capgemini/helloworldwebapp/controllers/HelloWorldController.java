package com.capgemini.helloworldwebapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.helloworldwebapp.constants.Constants;


/**
 * Welcome's controller
 * 
 * @author clusardi
 * @version 1.0
 *
 */
@Controller
public class HelloWorldController {
	
	/*
	 * Logger
	 */
	private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

	
	
	/**
	 * Mapping of welcome page request (GET method is implicit)
	 * 
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(Constants.WELCOME_PAGE)
	public ModelAndView helloWorld() {
		
		log.debug("start helloWorld");

		String message = "<br>"
						+ "<div style='text-align:center;'>"
							+ "<h3>Hello World, Spring MVC</h3>"
							+ "This message is coming from com.capgemini.helloworldwebapp.controllers.HelloWorldController.java"
						+ "</div>"
						+ "<br>"
						+ "<br>";
		
		log.info("creato messaggi di benvenuto");
		
		log.debug("end helloWorld");
		
		return new ModelAndView("welcome", "message", message);
	}
}