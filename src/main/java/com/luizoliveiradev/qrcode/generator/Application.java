package com.luizoliveiradev.qrcode.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.luizoliveiradev.qrcode.generator",
		"com.luizoliveiradev.qrcode.generator.Infrastructure"
})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
