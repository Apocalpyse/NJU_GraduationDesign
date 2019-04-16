package nju.edu.graduationdesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaServer
@SpringBootApplication
public class UserCenterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterServiceApplication.class, args);
	}

}
