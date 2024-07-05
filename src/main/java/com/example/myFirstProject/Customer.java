package com.example.myFirstProject;

public class Customer {
    int cust_id;
    String cust_name;
    String product_name;
    int price;

    Customer(int cust_id,String cust_name,String product_name,int price)
    {
        this.cust_id=cust_id;
        this.cust_name=cust_name;
        this.product_name=product_name;
        this.price=price;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
