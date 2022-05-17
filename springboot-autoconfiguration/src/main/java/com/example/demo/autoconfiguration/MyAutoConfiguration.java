package com.example.demo.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.annotation.ConditionalOnMyPublicServiceEnabled;
import com.example.demo.conditions.MyCondition;
import com.example.demo.controllers.PublicServiceController;
import com.example.demo.service.PublicService;
import com.example.demo.service.PublicServiceImpl;

@Configuration
//@ConditionalOnClass(value = {MyCondition.class})
//@ConditionalOnMissingClass("com.example.demo.conditions.MyCondition")
@ConditionalOnResource(resources="classpath:application.properties")
public class MyAutoConfiguration {
	
//	@ConditionalOnBean(PublicServiceController.class)
	@ConditionalOnMyPublicServiceEnabled
	@Bean
	public PublicService getPublicService()
	{
		return new PublicServiceImpl() ;
			
		
	}
	
	@ConditionalOnBean(PublicService.class)
	@Bean
	public PublicServiceController publicServiceController(PublicService publicService)
	{
		return new PublicServiceController(publicService);
	}
}
