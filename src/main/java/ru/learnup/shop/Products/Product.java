package ru.learnup.shop.Products;

public abstract class Product {
    private String name;
    private int price;
    private int weight;
    private int expiration_date;
    private String category = "продукты";

    public Product (String name, int price, int weight, int expiration_date) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.expiration_date = expiration_date;
    }

    public Product (String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(int expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
