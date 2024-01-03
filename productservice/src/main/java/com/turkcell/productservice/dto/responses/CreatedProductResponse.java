package com.turkcell.productservice.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatedProductResponse {
    //Kaydedilen Veri Şudur Şeklinde Bir Dönüş Sağlamak Amacıyla

    private String id;
    private String name;


}
