package com.inspro.accountingservice;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountingController {
	 private static final String template = "Welcome, %s!";
	 private final AtomicLong counter = new AtomicLong();

	 @RequestMapping("/accounting")
	 @POST
	 @Consumes("application/json")
	 public Response accountingRequest(@RequestParam(value="ledgerEntry") String ledgerEntry) {
	     System.out.println(Calendar.getInstance().getTime()+" "+ledgerEntry);   
		 return Response.status(201).entity("successfully recieved the ledger entry: "+ledgerEntry).build();
	    }
	
	
	
}
