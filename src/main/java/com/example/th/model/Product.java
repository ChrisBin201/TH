package com.example.th.model; ;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.text.NumberFormat;
@Data
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    @NotBlank(message = "Code is required")
    private String code;
    @NotBlank(message = "Description is required")
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }


    public String getPriceCurrencyFormat() {
        NumberFormat currency
                = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

//    @Override
//    public String toString() {
//        return String.format("%s|%s|%s", code, description, price);
//    }

}
