package com.inventory.management.Inven.Model;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prod_id;

    @Column(name="productname")
    private String productname;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name="price")
    private double price;

    @Column(name ="quantity")
    private int quantity;


    public Products(){
        super();
    }
    public Products(Long prod_id, String productname, String description, String Category, double price, int quantity) {
        super();
        this.prod_id = prod_id;
        this.productname = productname;
        this.description = description;
        this.category = Category;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
