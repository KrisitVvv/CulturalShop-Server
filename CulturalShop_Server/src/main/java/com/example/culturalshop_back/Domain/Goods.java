package com.example.culturalshop_back.Domain;

import lombok.Data;

@Data
public class Goods {
    public int id;
    private String title;
    private String category;
    private String info;
    private String src;
    private float price;
    private int sales;

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
