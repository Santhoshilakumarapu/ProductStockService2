package net.java.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStockRepository extends JpaRepository<ProductStockEntity, Long>{

	ProductStockEntity findByProductNameAndProductAvailability(String productName,String productAvailability);
	
}
