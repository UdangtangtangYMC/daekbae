package com.udangtangtang.daekbae;

public class Post {
    //운송장 번호
    private Long number;
    //상품 이름
    private String product;
    //주문 날짜
    private String date;
    //배송 상태
    private String delivery_status;
    //구매 사이트
    private String purchase_site;
    //주문 수량
    private int order_quantity;
    //가격
    private int price;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDelivery_status() {
        return delivery_status;
    }

    public void setDelivery_status(String delivery_status) {
        this.delivery_status = delivery_status;
    }

    public String getPurchase_site() {
        return purchase_site;
    }

    public void setPurchase_site(String purchase_site) {
        this.purchase_site = purchase_site;
    }

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
