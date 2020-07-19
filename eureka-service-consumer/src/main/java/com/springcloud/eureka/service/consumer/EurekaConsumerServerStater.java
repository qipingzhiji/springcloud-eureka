package com.springcloud.eureka.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhanght
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumerServerStater {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerServerStater.class,args);
	}
}
