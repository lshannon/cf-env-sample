package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class UpsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpsTestApplication.class, args);
	}
	
}

@RestController
@Component
class EnvController {
	
	@Value("${envKeyNameA}")
	private String keyA;
	
	@Value("${envKeyNameB}")
	private String keyB;
	
	@RequestMapping("/")
	public String home() {
		StringBuilder values = new StringBuilder();
		boolean foundA = false;
		boolean foundB = false;
		System.out.println(System.getenv());
		 for (String key: System.getenv().keySet()) {
			 System.out.println("Checking: " + key + " comparing to: " + keyA + " or " + keyB);
			 if (key.equals(keyA)) {
				 values.append(keyA + "=" + System.getenv().get(key));
				 foundA = true;
			 }
			 if (key.equals(keyB)) {
				 values.append(keyB + "=" + System.getenv().get(key));
				 foundB = true;
			 } 
	     }
		 if (!foundA) {
			 values.append(keyA + "=" + "N/A");
		 }
		 if (!foundB) {
			 values.append(keyB + "=" + "N/A");
		 }
		 return values.toString();
	}

}


