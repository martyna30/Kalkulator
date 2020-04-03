package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private int quantity;
    private BigDecimal price;
    private BigDecimal value;
    Product product;
    Invoice invoice;

    public Item() {
    }

    public Item(int quantity, BigDecimal price, BigDecimal value) {
        this.quantity = quantity;
        this.price = price;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    //@NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    //@NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    //@NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}










