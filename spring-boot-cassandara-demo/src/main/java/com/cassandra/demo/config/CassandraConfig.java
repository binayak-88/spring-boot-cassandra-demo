/**
 * 
 */
package com.cassandra.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HP
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CassandraConfig extends AbstractCassandraConfiguration {

	@Value("${spring.data.cassandra.contact-points:placeholder}")
	private String contactPoints;

	@Value("${spring.data.cassandra.port:0000}")
	private int port;

	@Value("${spring.data.cassandra.keyspace:placeholder}")
	private String keySpace;

	@Value("${spring.data.cassandra.username}")
	private String username;

	@Value("${spring.data.cassandra.password}")
	private String password;

	@Value("${spring.data.cassandra.schema-action}")
	private String schemaAction;

	@Override
	protected String getKeyspaceName() {
		return keySpace;
	}

}
