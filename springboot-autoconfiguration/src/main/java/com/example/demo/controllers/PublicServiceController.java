package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PublicService;
/*
 Difference between @Componenet and @Controller :
 if we decalre class with @Component everytime it got scanned automaically and spring will create
  the respective bean automatically ,you have no control over it .
  
In case of @Bean annoation we have full control over the bean ,the way
 the respective bean will be  created 
 
 */

@RestController
@RequestMapping("/api")
public class PublicServiceController {

	private PublicService publicService;
	
	/*
	 * @Autowired is optional when ther eis only one constructor .if there are multiple contructor
	 *then we should mark the corresponding construtr with @Autowired .
	 *
	 *Whenever multiple constructors are available and developer is not writing @Autowire annotation explicitly the spring will always choose default constructir  to create objetc 
	 */
	
	public PublicServiceController()
	{
		
	}

	/*
	 Using @Autowired here we are forcing spring to use @Autowired annotation constructor everytime .
	 */
	
	//@Autowired
	public PublicServiceController(PublicService publicService) {

		this.publicService = publicService;
	}

	@RequestMapping("/public")
	public String publicAPI() {
		return publicService.publicAPIDetails();

	}
}
