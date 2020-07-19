package com.springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhanght
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStater {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerStater.class,args);
	}
}
