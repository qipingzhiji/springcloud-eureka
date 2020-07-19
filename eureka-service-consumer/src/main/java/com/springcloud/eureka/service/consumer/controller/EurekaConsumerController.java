package com.springcloud.eureka.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhanght
 */
@RestController
@RequestMapping("consumer")
public class EurekaConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("res/{res}")
	public String testConsumer(@PathVariable("res") String res) {
		String result = restTemplate.getForObject("http://EUREKA-PROVIDER-SERVICE" + "/provider/res/" + res, String.class);
		return result;
	}

}
