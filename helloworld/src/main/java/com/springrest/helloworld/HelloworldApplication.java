package com.springrest.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @springbootapplication tells spring to do autoconfiguration
 * it is the same as using all these three annotations together
 * 
 * @componentscan that tells spring to look for @controller, @ service etc
 * @enableautoconfiguration tells spring to be alert and help in auto-figure 
 * things based on libraries in this project
 * 
 * @configuration tells spring this contains beans *java objects* it should create
 * and manage them
 */
@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
