package com.david.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.entity.Product;
import com.david.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
//	private ProductService productService = new ProductService();
	@Autowired
	private ProductService productService;

	@GetMapping("/test")
	public String test() {
		return "test controller";
	}

	@GetMapping("/findall")
	public List<Product> findAll() {
		System.out.println("dsfgkjdsjkglvsfdklgbdfgdjgkd;fjgk");
		return productService.findAll();
	}

	@GetMapping("/tx")
	public String testTransaction() {
//		productService.save(new Product());
//		productService.save2();
		productService.transationTest();
		return "Transational Test";
	}
}
