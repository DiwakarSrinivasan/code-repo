package com.example.productconfigapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productconfigapi.model.Config;
import com.example.productconfigapi.model.Product;

@RestController
public class ProductResource {
	
	@RequestMapping("/api/getproductdetails")
	public List<Product> getProductInfo() {
		
		List<Product> productList = new ArrayList<Product>();
		Product productHP = new Product(10001,"HP");
		Product productDell = new Product(1002, "DELL");
		productList.add(productHP);
		productList.add(productDell);
		return productList;
		
	}
	
	@RequestMapping("/api/getconfigdetails")
	public List<Config> getConfigInfo() {
		
		
		return Arrays.asList(new Config(8, "1 TB"), new Config(12, "2 TB"));
		
	}

}
