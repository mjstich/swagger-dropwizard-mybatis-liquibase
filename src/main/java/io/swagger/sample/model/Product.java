package io.swagger.sample.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;


/**
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("body_html")
    private String bodyHtml;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "title", required = true)
    private String title;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("vendor")
    private String vendor;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("published_at")
    private String publishedAt;

    @JsonProperty("handle")
    private String handle;

    @JsonProperty("template_suffix")
    private String templateSuffix;

    @JsonProperty("tags")
    private String tags;

    @JsonProperty("published_scope")
    private String publishedScope;

    @JsonProperty("src")
    private String src;

    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;

    @JsonProperty("variants")
    private List<Variant> variants;

    @JsonProperty("images")
    private List<Image> images;

    @JsonProperty("image")
    private Image image;

    @JsonProperty("options")
    private List<Option> options;

    @JsonProperty("id")
    public Long getId() {
        return this.id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("body_html")
    public String getBodyHtml() {
        return this.bodyHtml;
    }

    @JsonProperty("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    @JsonProperty(value = "title", required = true)
    public String getTitle() {
        return this.title;
    }

    @JsonProperty(value = "title", required = true)
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("product_type")
    public String getProductType() {
        return this.productType;
    }

    @JsonProperty("product_type")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("vendor")
    public String getVendor() {
        return this.vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
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

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return this.publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @JsonProperty("handle")
    public String getHandle() {
        return this.handle;
    }

    @JsonProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    @JsonProperty("template_suffix")
    public String getTemplateSuffix() {
        return this.templateSuffix;
    }

    @JsonProperty("template_suffix")
    public void setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = templateSuffix;
    }

    @JsonProperty("tags")
    public String getTags() {
        return this.tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("published_scope")
    public String getPublishedScope() {
        return this.publishedScope;
    }

    @JsonProperty("published_scope")
    public void setPublishedScope(String publishedScope) {
        this.publishedScope = publishedScope;
    }

    @JsonProperty("src")
    public String getSrc() {
        return this.src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    @JsonProperty("admin_graphql_api_id")
    public String getAdminGraphqlApiId() {
        return this.adminGraphqlApiId;
    }

    @JsonProperty("admin_graphql_api_id")
    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    @JsonProperty("variants")
    public List<Variant> getVariants() {
        return this.variants;
    }

    @JsonProperty("variants")
    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return this.images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("image")
    public Image getImage() {
        return this.image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return this.options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
