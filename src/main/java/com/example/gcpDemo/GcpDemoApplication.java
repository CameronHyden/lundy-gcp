package com.example.gcpDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GcpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpDemoApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage(){
		return "Hi i am chilling in the cloud";
	}


}
