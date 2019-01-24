package com.cg.eureka.eurekaservice.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class EurekaServiceResource {

		@GetMapping
		public ResponseEntity<String> hello() {
			return new ResponseEntity<String>("Hello World!!!", HttpStatus.OK) ;
		}
}
