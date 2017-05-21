package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.config.RepositoryConfiguration;
import com.example.config.SecurityConfig;

@SpringBootApplication
@Import({ RepositoryConfiguration.class })
public class SpringBootProject2Application extends SpringBootServletInitializer{

	@Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(SpringBootProject2Application.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject2Application.class, args);
	}
	
}

