package com.PlantPlaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator
 *Handle the /start endpoing
 *@return
 */

@Controller



public class PlantPlacesController {
	@RequestMapping("/start")
	public String start() {
		
		return "start";	
	}
	
	/**
	 * Handle the / endpoints
	 * @return
	 * 
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
