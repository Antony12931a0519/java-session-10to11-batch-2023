package com.javasession.bms.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

	Logger logger = LoggerFactory.getLogger(RestTemplateConfiguration.class);

	@Bean
	public RestTemplate getRestTemplate() {
		logger.info("creating rest tempplate object.");

		return new RestTemplate();

	}

}
