package ru.learnup.shop.StoresTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.learnup.shop.MyExeption.NonExistentProduct;
import ru.learnup.shop.Products.*;
import ru.learnup.shop.Stores.Books_Store_Bukvoed;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Books_Store_BukvoedTest {

    Books_Store_Bukvoed bukvoed;

    Book the_witcher;
    Book the_witcher2;
    Book harry_potter;

    Soap lavender;
    Soap dandelion;
    Soap camomile;

    @BeforeEach
    public void initialize() {
        bukvoed = new Books_Store_Bukvoed();

        the_witcher = new Book("Ведьмак", 300, 250);
        the_witcher2 = new Book("Ведьмак", 300, 250);
        harry_potter = new Book("Гарри Поттер", 400, 300);

        lavender = new Soap("Лавандовое", 50, 100);
        dandelion = new Soap ("Ромашковое", 40, 100);
        camomile = new Soap ("Ромашковое", 50, 100);
    }


    @Test
    void add_Product() {
        bukvoed.add_Product(the_witcher);
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(the_witcher);
        assertEquals(expected, bukvoed.getProducts());
    }

    @Test
    void rm_Product() throws NonExistentProduct {
        bukvoed.add_Product(the_witcher);
        ArrayList<Product> expected = new ArrayList<>();
        bukvoed.rm_Product(the_witcher);
        assertEquals(expected, bukvoed.getProducts());
    }

    @Test
    void lowPriceBooks() {
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(the_witcher);
        expected.add(the_witcher2);

        ArrayList<Product> actual = new ArrayList<>();
        bukvoed.add_Product(the_witcher);
        bukvoed.add_Product(the_witcher2);
        bukvoed.add_Product(harry_potter);

        actual = bukvoed.lowPriceBooks(350);

        assertEquals(expected, actual);
    }

    @Test
    void all_Books() {

        bukvoed.add_Product(the_witcher);
        bukvoed.add_Product(the_witcher2);
        bukvoed.add_Product(harry_potter);

        bukvoed.add_Product(lavender);
        bukvoed.add_Product(dandelion);
        bukvoed.add_Product(camomile);

        ArrayList<Product> expected = new ArrayList<>();

        expected.add(the_witcher);
        expected.add(the_witcher2);
        expected.add(harry_potter);

        ArrayList<Product> actual = bukvoed.all_Books();

        assertEquals(expected, actual);
    }
}