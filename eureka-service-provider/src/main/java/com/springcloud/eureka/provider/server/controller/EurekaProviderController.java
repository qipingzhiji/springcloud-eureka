package com.springcloud.eureka.provider.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanght
 */
@RestController
@RequestMapping("provider")
public class EurekaProviderController {

	@GetMapping("res/{res}")
	public String eurekaProviderTest(@PathVariable("res") String res) {
		return res;
	}
}
