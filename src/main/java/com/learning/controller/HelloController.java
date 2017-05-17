/**
 * 
 */
package com.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bhatiam0
 *
 */

@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hellos! Application is running";
	}

}
