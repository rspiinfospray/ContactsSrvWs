package org.infospray.springboot.config;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@ComponentScan("org.infospray")
@EnableAutoConfiguration
public class Runner {

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}



	@Bean
	public Properties getQueryProperties(){

		Properties queryProperties = null;

		try {
			File file = new File("src/main/resources","query.properties");
			queryProperties = PropertiesLoaderUtils.loadProperties(new FileSystemResource(file));
		} catch (IOException e) {
		}

		return queryProperties;
	}


}
