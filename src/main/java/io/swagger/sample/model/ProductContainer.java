package io.swagger.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductContainer {

    @JsonProperty("products")
    private List<Product> products;

    @JsonProperty("products")
    public List<Product> getProducts() {
        return this.products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
