package ru.learnup.shop.Stores_Interfaces;

import ru.learnup.shop.Products.Book;
import ru.learnup.shop.Products.Product;

import java.util.ArrayList;

public interface Books_Store {

    public ArrayList<Product> lowPriceBooks (int lowP);

    public ArrayList<Product> all_Books ();
}
