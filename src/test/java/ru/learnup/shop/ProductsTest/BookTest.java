package ru.learnup.shop.ProductsTest;


import ru.learnup.shop.Products.Book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BookTest  {

    Book book;

    @BeforeEach
    public void createBook() {
        book = new Book("Идиот", 400, 300);

    }


    @Test
    void getName() {
        assertEquals("Идиот", book.getName());
    }

    @Test
    void setName() {
        book.setName("Бесы");
        assertEquals("Бесы", book.getName());
    }

    @Test
    void getPrice() {
        assertEquals(400, book.getPrice());
    }

    @Test
    void setPrice() {
        book.setPrice(500);
        assertEquals(500, book.getPrice());

    }

    @Test
    void getWeight() {
        assertEquals(300, book.getWeight());
    }

    @Test
    void setWeight() {
        book.setWeight(400);
        assertEquals(400, book.getWeight());
    }

    @Test
    void getExpiration_date() {
        assertEquals(-1, book.getExpiration_date());
    }

    @Test
    void setExpiration_date() {
        book.setExpiration_date(100);
        assertEquals(100, book.getExpiration_date());

    }

    @Test
    void getCategory() {
        assertEquals("book", book.getCategory());
    }

    @Test
    void setCategory() {
        book.setCategory("fantasy book");
        assertEquals("fantasy book", book.getCategory());
    }

}