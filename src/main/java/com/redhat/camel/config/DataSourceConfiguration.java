package com.redhat.camel.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

	@Primary
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.prod")
	public DataSource prodDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.dmz")
	public DataSource dmzDataSource() {
		return DataSourceBuilder.create().build();
	}

}
