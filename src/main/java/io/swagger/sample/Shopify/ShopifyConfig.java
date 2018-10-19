package io.swagger.sample.Shopify;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class ShopifyConfig {

    @NotNull
    @JsonProperty
    private String accessToken;

    @NotNull
    @JsonProperty
    private String domain;

    @NotNull
    @JsonProperty
    private String id;

    @NotNull
    @JsonProperty
    private String token;


    public ShopifyConfig() {
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
