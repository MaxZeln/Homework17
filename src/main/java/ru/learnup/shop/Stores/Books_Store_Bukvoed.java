package ru.learnup.shop.Stores;

import ru.learnup.shop.Add_Remove_Classes.Add_Rm_Product;

import ru.learnup.shop.MyExeption.NonExistentProduct;

import ru.learnup.shop.Products.Product;

import ru.learnup.shop.Stores_Interfaces.Books_Store;

import java.util.ArrayList;



public class Books_Store_Bukvoed extends Add_Rm_Product implements Books_Store  {

    Searching_By_Index Index = new Searching_By_Index();


    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }


    @Override
    public void add_Product (Product product) {
        products.add(product);

        if (Index.searchingByIndex.get(product.getName()) == null){
            Index.searchingByIndex.put(product.getName(), 1);
        } else {
            int value = Index.searchingByIndex.get(product.getName());
            value += 1;
            Index.searchingByIndex.put(product.getName(), value);
        }

    }


    @Override
    public void rm_Product (Product product) throws NonExistentProduct {
        System.out.println();
        try {
            if (products.contains(product) == false) {
                throw new NonExistentProduct ("Продукт по заданным параметрам не найдена, либо не существует");
            }

            products.remove(product);

            int value = Index.searchingByIndex.get(product.getName());

            value += -1;
            Index.searchingByIndex.put(product.getName(), value);

            if(Index.searchingByIndex.get(product.getName()) == 0) {
                Index.searchingByIndex.remove(product.getName());
            }

        } catch (NonExistentProduct exc) {
            System.out.println(exc);
        }
        System.out.println();
    }


    @Override
    public ArrayList<Product> lowPriceBooks (int lowP) {

        ArrayList<Product> low_price_books = new ArrayList<>();

        for (int j = 0; j < products.size(); j++) {
            if(products.get(j).getCategory().contains("book")) {
                if (products.get(j).getPrice() < lowP) {
                    low_price_books.add(products.get(j));
                }
            }
        }

        System.out.println();
        System.out.println("Книги с ценой ниже " + lowP + " представлены ниже:");

        for (int i = 0; i < low_price_books.size(); i++) {
            System.out.println(low_price_books.get(i).getName());
        }

        System.out.println();

        return low_price_books;
    }

    @Override
    public ArrayList<Product> all_Books () {

        ArrayList<Product> searched_books = new ArrayList<>();

        int g = 0;

        for (int j = 0; j < products.size(); j++) {
            if(products.get(j).getCategory().contains("book")) {
                searched_books.add(products.get(j));
            }
        }

        System.out.println();
        System.out.println("Список всех книг представлены ниже:");
        for (int i = 0; i < searched_books.size(); i++) {
            if (i != searched_books.size() - 1) {
                System.out.print(searched_books.get(i).getName() + ", ");
            } else {
                System.out.print(searched_books.get(i).getName());
            }
        }

        System.out.println();
        System.out.println();

        return searched_books;
    }
}