package com.jiabian.base.io;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class RestBaseService {

	public static final ObjectMapper objectMapper = new ObjectMapper();
	static {
		objectMapper
				.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
	}

	public static final String RETURN_INTERFACE_KEY = "ICResponse";

}
