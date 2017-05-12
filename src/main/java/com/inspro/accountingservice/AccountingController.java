package com.inspro.accountingservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountingController {
	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	 @RequestMapping("/accounting")
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),
	                String.format(template, name));
	    }
	
	
	
}
