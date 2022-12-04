package arp.training.cloudkitchen.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table // (name="product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
    @Id 
    private long productId;
    private String name;
    private float price;
    private String description;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "category_id")    
    // private Category category;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
