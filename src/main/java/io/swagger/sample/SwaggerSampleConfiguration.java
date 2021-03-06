package io.swagger.sample;

import com.google.inject.Provides;
import io.dropwizard.Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.sample.Shopify.ShopifyConfig;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;



import io.dropwizard.db.DataSourceFactory;

public class SwaggerSampleConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String defaultName = "swagger-sample";

    public String getDefaultName() {
    return defaultName;
  }

    @NotNull
    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();

    public DataSourceFactory getDataSourceFactory() {
      return database;
  }

    public void setDatabase(DataSourceFactory database) {
        this.database = database;
    }

    @NotNull
    @JsonProperty("shopify")
    private ShopifyConfig shopify = new ShopifyConfig();

    public void setShopify(ShopifyConfig shopifyConfig) {
        this.shopify = shopifyConfig;
    }

    public ShopifyConfig getShopify() {
        return this.shopify;
    }
}
