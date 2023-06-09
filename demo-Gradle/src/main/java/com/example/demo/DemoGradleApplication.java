package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGradleApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return String.format("Bienvenido a Spring Framework");
	}
	
	@GetMapping("/hello")
    public String hello() {
      return String.format("Hola mundo");
    }
	
	@GetMapping("/saluda")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
}
