package ru.learnup.shop.Products;

public class Cake extends Product {

    String category = "cake";

    public Cake(String name, int price, int weight, int expiration_date) {
        super(name, price, weight, expiration_date);
        super.setCategory(category);
    }
}