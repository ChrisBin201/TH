package com.example.th;

import com.example.th.model.Product;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
public class Cart {

    private ArrayList<Product> listProduct;
    public Cart() {
        listProduct = new ArrayList<Product>();
    }

}
