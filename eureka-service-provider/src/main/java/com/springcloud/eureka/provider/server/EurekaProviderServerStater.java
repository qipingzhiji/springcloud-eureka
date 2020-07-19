package com.springcloud.eureka.provider.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhanght
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderServerStater {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderServerStater.class,args);
	}
}
