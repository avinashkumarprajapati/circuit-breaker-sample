package com.sample.circuitbreakerbookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBBookStoreController {
	
	@RequestMapping(value = "/recommended")
	  public String readingList(){
	  return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
	  }
}
