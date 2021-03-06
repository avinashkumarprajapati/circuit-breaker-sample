package com.sample.circuitbreakerreading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sample.circuitbreakerreading.service.BookService;


@RestController
public class CBBookReadingController {
	 @Autowired
	  private BookService bookService;

	  @Bean
	  public RestTemplate rest(RestTemplateBuilder builder) {
	  return builder.build();
	  }

	  @RequestMapping("/to-read")
	  public String toRead() {
	  return bookService.readingList();
	  }
}
