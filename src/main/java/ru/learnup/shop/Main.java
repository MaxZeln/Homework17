package ru.learnup.shop;

import ru.learnup.shop.MyExeption.NonExistentProduct;
import ru.learnup.shop.Products.Book;
import ru.learnup.shop.Products.BookBuilder;
import ru.learnup.shop.Stores.Books_Store_Bukvoed;

public class Main {
    public static void main(String[] args) {

        Books_Store_Bukvoed Bukvoed = new Books_Store_Bukvoed();

        Book master_and_margaryta = new Book("Мастер и маргарита", 400, 150);
        Book master_and_margaryta2 = new Book("Мастер и маргарита", 400, 150);
        Book the_witcher = new Book("Ведьмак", 300, 250);
        Book the_witcher2 = new Book("Ведьмак", 300, 250);
        Book harry_potter = new Book("Гарри Поттер", 400, 300);


        Book Anna_Karenina = new BookBuilder()
                    .setName("Анна каренина")
                    .setPrice(250)
                    .setWeight(200)
                    .build();


        Bukvoed.add_Product(master_and_margaryta);
        Bukvoed.add_Product(master_and_margaryta2);


        System.out.println(Bukvoed.getProducts());

        try {
            Bukvoed.rm_Product(master_and_margaryta);
            Bukvoed.rm_Product(master_and_margaryta2);
        } catch (NonExistentProduct exc) {
            System.out.println(exc);
        }

        Bukvoed.add_Product(the_witcher);
        Bukvoed.add_Product(the_witcher2);
        Bukvoed.add_Product(harry_potter);

        Bukvoed.lowPriceBooks(500);
    }
}
