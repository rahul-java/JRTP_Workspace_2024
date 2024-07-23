package com.mea.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ArithmeticOperationsController {


	@GetMapping("/div")
	public ResponseEntity<String> division() {

		//log.info("At the begining of division() method.");
		//log.trace("At the begining of division() method.");
		log.debug("At the begining of division() method.");
		try {
			//log.info("Performing Arithmetic Operation");
			//log.trace("Performing Arithmetic Operation");
			log.debug("Performing Arithmetic Operation");
			int result = 100 / 0;
			//log.info("Arithmetic Operation Successful");
			//log.trace("Arithmetic Operation Successful");
			log.debug("Arithmetic Operation Successful");
			return new ResponseEntity<String>("Result is : " + result, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Problem in Arithmetic Operation : "+e.getMessage());
			return new ResponseEntity<String>("Problem in Arithmetic Operation : " + e.getMessage(), HttpStatus.OK);
		}

	}
}
