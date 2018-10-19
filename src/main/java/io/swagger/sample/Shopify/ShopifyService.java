package io.swagger.sample.Shopify;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import io.swagger.sample.SwaggerSampleConfiguration;

import io.swagger.sample.model.Product;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Singleton
public class ShopifyService {

    private static final long TIMEOUT_SECONDS = 20;

    private final ShopifyClient shopify;
    private final ShopifyConfig shopifyConfig;

    @Inject
    public ShopifyService(SwaggerSampleConfiguration configuration) {

        shopifyConfig = configuration.getShopify();

        // Add object mapper because the JsonProperty annotations don't match the json strings
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        //objectMapper.enable(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING);

        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));

        JacksonConverterFactory jacksonConverterFactory = JacksonConverterFactory.create(objectMapper);


        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS).build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://" + shopifyConfig.getDomain())
                .addConverterFactory(jacksonConverterFactory)
                .build();

        shopify = retrofit.create(ShopifyClient.class);
    }

    public List<Product> getProducts() throws IOException  {
        return shopify.getProducts(shopifyConfig.getAccessToken(), shopifyConfig.getDomain(), shopifyConfig.getId(), shopifyConfig.getToken()).execute().body().getProducts();
    }
}
