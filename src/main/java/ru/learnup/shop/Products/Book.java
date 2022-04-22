package ru.learnup.shop.Products;

public class Book extends Product {

    int expiration_date = -1;
    String category = "book";

    public Book (String name, int price, int weight) {
        super(name, price, weight);
        super.setCategory(category);
        super.setExpiration_date(expiration_date);
    }
}
