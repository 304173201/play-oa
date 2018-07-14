package org.liu.flowTool.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.liu.*"})
public class StartApp {
	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
	}
}
