package net.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.java.beans.ProductStock;
import net.java.entity.ProductStockEntity;
import net.java.entity.ProductStockRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductStockRepository productRepo;
	
	@Autowired
	Environment environment;
	
	@GetMapping("/check-product-stock/{productName}/{productAvailability}")
	public ProductStock checkProductStock(@PathVariable String productName, @PathVariable String productAvailability)
	{
		ProductStockEntity productEntity = productRepo.findByProductNameAndProductAvailability(productName, productAvailability);
		ProductStock productStock = new ProductStock(
				productEntity.getId(),
				productEntity.getProductName(),
				productEntity.getProductPrice(),
				productEntity.getProductAvailability(),
				productEntity.getDiscountOffer(),
				Integer.parseInt(environment.getProperty("local.server.port")));
		return productStock; 
	}
	
	

}
