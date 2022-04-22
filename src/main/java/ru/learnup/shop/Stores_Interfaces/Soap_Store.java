package ru.learnup.shop.Stores_Interfaces;

import java.util.ArrayList;

import ru.learnup.shop.Products.Product;

public interface Soap_Store {

    public void lowPriceSoap (int lowP);

    public void all_Soap (ArrayList<Product> soaps);
}