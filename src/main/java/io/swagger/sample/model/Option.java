package io.swagger.sample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Option {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("position")
    private Long position;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "title", required = true)
    private String title;

    @JsonProperty("values")
    private List<String> values;

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

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("values")
    public List<String> getValues() {
        return this.values;
    }

    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
    }
}


