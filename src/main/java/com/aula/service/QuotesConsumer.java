package com.aula.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="quote", url="https://api.kanye.rest/")
public interface QuotesConsumer {
	
	@GetMapping
	String getQuote();

}
