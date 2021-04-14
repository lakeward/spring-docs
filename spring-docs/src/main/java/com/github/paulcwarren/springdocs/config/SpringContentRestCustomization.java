package com.github.paulcwarren.springdocs.config;

import org.springframework.content.rest.config.ContentRestConfigurer;
import org.springframework.content.rest.config.RestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContentRestCustomization {

//	@Bean
//	public ContentRestConfigurer contentRestConfigurer() {
//		System.out.println("LAUREN");
//		return new ContentRestConfigurer() {
//			@Override
//			public void configure(RestConfiguration config) {
//				config.getCorsRegistry()
//						.addMapping("/**")
//						.allowedMethods("*")
//						.allowedOrigins("*")
//						.maxAge(3600);
//			}
//		};
//	}
}