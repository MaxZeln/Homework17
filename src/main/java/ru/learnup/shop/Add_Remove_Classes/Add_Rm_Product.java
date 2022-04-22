package ru.learnup.shop.Add_Remove_Classes;

import ru.learnup.shop.MyExeption.NonExistentProduct;
import ru.learnup.shop.Products.Product;

import java.util.ArrayList;

public abstract class Add_Rm_Product {

    public void add_Product (ArrayList<Product> products, Product product) {
        products.add(product);
    }

    public void add_Product (Product product) {

    }

    public void rm_Product (ArrayList<Product> products, Product product) {
        products.remove(product);
    }

    public void rm_Product (Product product) throws NonExistentProduct, NonExistentProduct {

    }

}
