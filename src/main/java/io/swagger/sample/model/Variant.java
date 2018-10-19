package io.swagger.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class Variant {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("product_id")
    private Long productId;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "title", required = true)
    private String title;

    @JsonProperty("price")
    private String price;

    @JsonProperty("compare_at_price")
    private String compareAtPrice;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("position")
    private Long position;

    @JsonProperty("inventory_policy")
    private String inventoryPolicy;

    @JsonProperty("fulfillment_service")
    private String fulfillmentService;

    @JsonProperty("inventory_management")
    private String inventoryManagement;

    @JsonProperty("option1")
    private String option1;

    @JsonProperty("option2")
    private String option2;

    @JsonProperty("option3")
    private String option3;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("taxable")
    private Boolean taxable;

    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;

    @JsonProperty("barcode")
    private String barcode;

    @JsonProperty("grams")
    private Long grams;

    @JsonProperty("image_id")
    private String imageId;

    @JsonProperty("inventory_quantity")
    private Long inventoryQuantity;

    @JsonProperty("weight")
    private Double weight;

    @JsonProperty("weight_unit")
    private String weightUnit;

    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;

    @JsonProperty("old_inventory_quantity")
    private Long oldInventoryQuantity;

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

    @JsonProperty(value = "title", required = true)
    public String getTitle() {
        return this.title;
    }

    @JsonProperty(value = "title", required = true)
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("price")
    public String getPrice() {
        return this.price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("compare_at_price")
    public String getCompareAtPrice() {
        return this.compareAtPrice;
    }

    @JsonProperty("compare_at_price")
    public void setCompareAtPrice(String compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    @JsonProperty("sku")
    public String getSku() {
        return this.sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    @JsonProperty("position")
    public Long getPosition() {
        return this.position;
    }

    @JsonProperty("position")
    public void setPosition(Long position) {
        this.position = position;
    }

    @JsonProperty("inventory_policy")
    public String getInventoryPolicy() {
        return this.inventoryPolicy;
    }

    @JsonProperty("inventory_policy")
    public void setInventoryPolicy(String inventoryPolicy) {
        this.inventoryPolicy = inventoryPolicy;
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

    @JsonProperty("fulfillment_service")
    public String getFulfillmentService() {
        return this.fulfillmentService;
    }

    @JsonProperty("fulfillment_service")
    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    @JsonProperty("inventory_management")
    public String getInventoryManagement() {
        return this.inventoryManagement;
    }

    @JsonProperty("inventory_management")
    public void setInventoryManagement(String inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    @JsonProperty("option1")
    public String getOption1() {
        return this.option1;
    }

    @JsonProperty("option1")
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    @JsonProperty("option2")
    public String getOption2() {
        return this.option2;
    }

    @JsonProperty("option2")
    public void setOption2(String option2) {
        this.option2 = option2;
    }

    @JsonProperty("option3")
    public String getOption3() {
        return this.option3;
    }

    @JsonProperty("option3")
    public void setOption3(String option3) {
        this.option3 = option3;
    }

    @JsonProperty("taxable")
    public Boolean getTaxable() {
        return this.taxable;
    }

    @JsonProperty("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    @JsonProperty("requires_shipping")
    public Boolean getRequiresShipping() {
        return this.requiresShipping;
    }

    @JsonProperty("requires_shipping")
    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    @JsonProperty("barcode")
    public String getBarcode() {
        return this.barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @JsonProperty("grams")
    public Long getGrams() {
        return this.grams;
    }

    @JsonProperty("grams")
    public void setGrams(Long grams) {
        this.grams = grams;
    }

    @JsonProperty("image_id")
    public String getImageId() {
        return this.imageId;
    }

    @JsonProperty("image_id")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("inventory_quantity")
    public Long getInventoryQuantity() {
        return this.inventoryQuantity;
    }

    @JsonProperty("inventory_quantity")
    public void setInventoryQuantity(Long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    @JsonProperty("weight")
    public Double getWeight() {
        return this.weight;
    }

    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @JsonProperty("weight_unit")
    public String getWeightUnit() {
        return this.weightUnit;
    }

    @JsonProperty("weight_unit")
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    @JsonProperty("inventory_item_id")
    public Long getInventoryItemId() {
        return this.inventoryItemId;
    }

    @JsonProperty("inventory_item_id")
    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @JsonProperty("old_inventory_quantity")
    public Long getOldInventoryQuantity() {
        return this.oldInventoryQuantity;
    }

    @JsonProperty("old_inventory_quantity")
    public void setOldInventoryQuantity(Long oldInventoryQuantity) {
        this.oldInventoryQuantity = oldInventoryQuantity;
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