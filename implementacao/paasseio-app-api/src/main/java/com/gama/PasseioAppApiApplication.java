package com.gama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gama.start.PasseioStart;

@SpringBootApplication
public class PasseioAppApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PasseioAppApiApplication.class, args);
		PasseioStart start = run.getBean(PasseioStart.class);
		start.iniciar();		
	}

}