package com.mea.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishMessageOperationsController {

	private Logger logger=LoggerFactory.getLogger(WishMessageOperationsController.class);
	
	@GetMapping("/greet")
	public ResponseEntity<String> showMessage(){
		
		logger.info("At the begining of showMessage() method.");
		String msg="Good Morning";
		logger.info("At the end of showMessage() method.");
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
