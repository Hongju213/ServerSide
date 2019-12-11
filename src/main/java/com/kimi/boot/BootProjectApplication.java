package com.kimi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableAspectJAutoProxy
@SpringBootApplication
@EnableEncryptableProperties
@EnableAutoConfiguration
public class BootProjectApplication extends SpringBootServletInitializer {

	//
//	public static void main(String[] args) {
//		SpringApplication.run(BootProjectApplication.class, args);
//	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootProjectApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootProjectApplication.class, args);
		
	}
}
