package org.soluvas.earsample.rs;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider @Produces(MediaType.APPLICATION_JSON)
public class JacksonContextResolver implements ContextResolver<ObjectMapper> {

	private transient Logger log = LoggerFactory.getLogger(JacksonContextResolver.class);
	private ObjectMapper objectMapper;

	public JacksonContextResolver() {
		log.info("Using my own Jackson ObjectMapper");
		objectMapper = new ObjectMapper();
		objectMapper.configure(Feature.INDENT_OUTPUT, true);
		objectMapper.configure(Feature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.configure(Feature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
	}
	
	@Override
	public ObjectMapper getContext(Class<?> type) {
		return objectMapper;
	}
}
