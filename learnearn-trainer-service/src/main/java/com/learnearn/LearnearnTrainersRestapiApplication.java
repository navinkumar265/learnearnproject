package com.learnearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class LearnearnTrainersRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnearnTrainersRestapiApplication.class, args);
	}
	@Bean
//	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
