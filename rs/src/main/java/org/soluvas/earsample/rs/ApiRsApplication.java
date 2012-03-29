/**
 * 
 */
package org.soluvas.earsample.rs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

/**
 * @author ceefour
 *
 */

@ApplicationPath("/")
public class ApiRsApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<Object>(super.getSingletons());
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(Feature.INDENT_OUTPUT, true);
		objectMapper.configure(Feature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.configure(Feature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
		singletons.add(objectMapper);
		return singletons;
	}
}
