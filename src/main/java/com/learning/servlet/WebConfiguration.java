/**
 * 
 */
package com.learning.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * This is a way to register a servlet with spring boot as with springboot,
 * there is no web.xml.
 * 
 * @author bhatiam
 *
 */

@Configuration
public class WebConfiguration implements ServletContextInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		initH2Console(servletContext);
	}

	private void initH2Console(ServletContext servletContext) {
		ServletRegistration.Dynamic h2ConsoleServlet = servletContext.addServlet("H2Console", new WebServlet());
		h2ConsoleServlet.addMapping("/h2console/*");
		h2ConsoleServlet.setLoadOnStartup(1);
	}

}
