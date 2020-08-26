package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AmsMvcApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AmsMvcApplication.class, args);
		System.out.println("end mvc");
	}

}
