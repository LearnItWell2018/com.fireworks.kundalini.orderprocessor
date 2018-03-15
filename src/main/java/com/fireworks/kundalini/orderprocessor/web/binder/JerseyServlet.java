package com.fireworks.kundalini.orderprocessor.web.binder;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.sun.jersey.spi.spring.container.servlet.SpringServlet;

@WebServlet(urlPatterns = { "/rs/*" }, initParams = { @WebInitParam(name = "com.sun.jersey.config.property.packages", value = "com.fireworks.kundalini.orderprocessor.rest"), 
		@WebInitParam(name = "com.sun.jersey.api.json.POJOMappingFeature", value = "true"),
		@WebInitParam(name = "com.sun.jersey.spi.container.ContainerResponseFilters", value = "com.fireworks.kundalini.orderprocessor.web.binder.CORSFilter")})
public class JerseyServlet extends SpringServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}