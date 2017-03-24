package com.jolivas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class TimetableApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app){
		return app.sources(TimetableApplication.class);
	}

	public static void main(String[] args) throws Exception{
		SpringApplication.run(TimetableApplication.class, args);
	}
}
