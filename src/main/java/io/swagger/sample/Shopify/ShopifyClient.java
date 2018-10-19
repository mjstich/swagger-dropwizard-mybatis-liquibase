package io.swagger.sample.Shopify;

import io.swagger.sample.model.Product;
import io.swagger.sample.model.ProductContainer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

import java.util.List;

public interface ShopifyClient {

    @GET("/admin/products.json")
    Call<ProductContainer> getProducts(@Header("X-Shopify-Access-Token") String accessToken,
                                       @Header("x-shopify-shop-domain") String domain,
                                       @Header("id") String id,
                                       @Header("token") String token);
}
