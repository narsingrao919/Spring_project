package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.example")
@EnableMongoRepositories(basePackageClasses=com.example.repo.Applerepo.class)
public class SpringbootreactapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootreactapplicationApplication.class, args);
	}

}
