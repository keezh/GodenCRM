package com.yelot.entity;

import java.util.Date;

/**
 * 门店实体类
 * Created by kee on 17/5/26.
 */
public class Shop {
    private Long id;
    /**
     * 门店名称
     */
    private String name;
    /**
     * 地址
     */
    private String address;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 创建时间
     */
    private Date create_at;
    /**
     * 更新时间
     */
    private Date update_at;

    public Shop(){

    }

    public Shop(String name,String address,String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
}
