package com.sme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmeFinApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(SmeFinApplication.class, args);
		System.out.println("end");
	}

}
