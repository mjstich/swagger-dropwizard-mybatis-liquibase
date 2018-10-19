package io.swagger.sample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("position")
    private Long position;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("alt")
    private String alt;

    @JsonProperty("width")
    private Long width;

    @JsonProperty("height")
    private Long height;

    @JsonProperty("src")
    private String src;

    @JsonProperty("variant_ids")
    private List<Long> variantIds;

    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;

    @JsonProperty("id")
    public Long getId() {
        return this.id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("product_id")
    public Long getProductId() {
        return this.productId;
    }

    @JsonProperty("product_id")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @JsonProperty("position")
    public Long getPosition() {
        return this.position;
    }

    @JsonProperty("position")
    public void setPosition(Long position) {
        this.position = position;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("alt")
    public String getAlt() {
        return this.alt;
    }

    @JsonProperty("alt")
    public void setAlt(String alt) {
        this.alt = alt;
    }

    @JsonProperty("width")
    public Long getWidth() {
        return this.width;
    }

    @JsonProperty("width")
    public void setWidth(Long width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Long getHeight() {
        return this.height;
    }

    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    @JsonProperty("src")
    public String getSrc() {
        return this.src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    @JsonProperty("variant_ids")
    public List<Long> getVariantIds() {
        return this.variantIds;
    }

    @JsonProperty("variant_ids")
    public void setVariantIds(List<Long> variantIds) {
        this.variantIds = variantIds;
    }

    @JsonProperty("admin_graphql_api_id")
    public String getAdminGraphqlApiId() {
        return this.adminGraphqlApiId;
    }

    @JsonProperty("admin_graphql_api_id")
    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }
}
