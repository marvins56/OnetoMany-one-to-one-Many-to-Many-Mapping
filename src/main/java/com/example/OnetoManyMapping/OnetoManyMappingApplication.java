package com.example.OnetoManyMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OnetoManyMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetoManyMappingApplication.class, args);
	}

}
