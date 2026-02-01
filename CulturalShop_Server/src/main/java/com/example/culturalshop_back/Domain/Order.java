package com.example.culturalshop_back.Domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private int id;
    @JsonProperty("UID")
    private String UID;
    private String goods;
    private Integer number;
    private BigDecimal price;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUID() { return UID; }
    public void setUID(String UID) { this.UID = UID; }

    public String getGoods() { return goods; }
    public void setGoods(String goods) { this.goods = goods; }

    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Date getCreateTime() { return createTime; }
    public void setCreateTime(Date createTime) { this.createTime = createTime; }
}