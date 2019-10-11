package uk.co.nstech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "uk.co.nstech.controller" })
public class MicroService {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MicroService.class, args);
	}
}
