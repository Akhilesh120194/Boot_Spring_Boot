package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootAutoconfigurationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootAutoconfigurationApplication.class, args);
		/*
		 * String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		 * 
		 * for(String beans:beanDefinitionNames) { System.out.println(beans); }
		 */
	}

}
