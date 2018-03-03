package com.fireworks.kundalini.orderprocessor.helper;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.fireworks.kundalini.orderprocessor.error.Error;
import com.fireworks.kundalini.orderprocessor.pojo.Order;

public class Helper {

	public static String provideJSON4POJO(Order order) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(order);
		} catch (IOException e) {
			return Error.ERR01;
		}
	}

	public static Order providePOJO4JSON(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(json, Order.class);
		} catch (IOException e) {
			return new Order();
		}
	}

}
