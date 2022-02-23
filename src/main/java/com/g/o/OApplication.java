package com.g.o;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OApplication {
@GetMapping("/")
public String hello()
{
	return "hello";
}
@GetMapping("/welcome")
public String welcome()
{
	return "welcome to codepipeline";
}
	public static void main(String[] args) {
		SpringApplication.run(OApplication.class, args);
	}

}