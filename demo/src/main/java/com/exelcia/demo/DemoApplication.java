package com.exelcia.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String db = System.getenv("DATABASE_URL");
		System.out.println("DATABASE URL: " + db);
		SpringApplication.run(DemoApplication.class, args);
	}

}
