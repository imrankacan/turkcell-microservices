package com.turkcell.productservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document(value = "products") //Mongodb de Table yerine Document
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    private String inventoryCode;

}
