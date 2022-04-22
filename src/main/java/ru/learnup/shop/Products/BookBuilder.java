package ru.learnup.shop.Products;

public class BookBuilder {
    private String name;
    private int price;
    private int weight;


    public Book build () {
        return new Book(name, price, weight);
    }

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public BookBuilder setWeight (int weight) {
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }


}
