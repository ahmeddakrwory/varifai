package com.varyfai.example.demoviryfay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@EntityScan("com.varyfi.exampe.demovirfay.entity")
public class DemoviryfayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoviryfayApplication.class, args);
	}

}
