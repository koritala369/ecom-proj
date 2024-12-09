package com.telusko.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;

import java.math.BigDecimal;
import java.util.Date;

@Lazy
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("category")
    private String category;
    @JsonProperty("release_Date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date release_Date;
    @JsonProperty("available")
    private boolean available;
    @JsonProperty("quantity")
    private int quantity;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", releaseDate=" + release_Date +
                ", available=" + available +
                ", quantity=" + quantity +
                '}';
    }
}
