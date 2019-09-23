package com.example.howtodoinjava.springeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerApplication {

	public static void main(String[] args) {
		System.setProperty ("https.proxyHost", "proxy.houston.hpecorp.net");
		System.setProperty ("https.proxyPort", "8080");
		SpringApplication.run(SpringEurekaServerApplication.class, args);
	}
}
