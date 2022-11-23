package com.nttdata.bootcamp.configservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${product.product-name}")
	private String myProduct;
	
	@GetMapping(path="/getProductName")
	public String myProduct() {
		return this.myProduct;
	}
	
}
