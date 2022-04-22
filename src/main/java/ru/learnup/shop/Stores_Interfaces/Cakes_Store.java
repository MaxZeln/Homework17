package ru.learnup.shop.Stores_Interfaces;


import ru.learnup.shop.Products.Product;


import java.util.ArrayList;

public interface Cakes_Store {

    public void lowPriceCakes (ArrayList <Product> cakes, int lowP);

    public  void search_By_Expiration_Date (ArrayList<Product> cakes, int expiration_date);

    public void all_Cakes (ArrayList<Product> cakes);
}
