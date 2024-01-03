package com.turkcell.productservice.repositories;

import com.turkcell.productservice.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<Product, String> {
    //Derived Query Method
    Product findByInventoryCode(String inventoryCode);

    @Query("{'inventoryCode': ?0}") // ?0 = Sıfırıncı indexteki parametre
    Product findByInventoryCodeQuery(String invCode);

}
