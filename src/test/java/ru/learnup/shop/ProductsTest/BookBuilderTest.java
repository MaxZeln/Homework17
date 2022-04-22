package ru.learnup.shop.ProductsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.learnup.shop.Products.Book;
import ru.learnup.shop.Products.BookBuilder;

import static org.junit.jupiter.api.Assertions.*;

class BookBuilderTest {

    BookBuilder builder;

    @BeforeEach
    public void createBuilder() {
        builder = new BookBuilder();
    }

    @Test
    void build() {
        Book Anna_Karenina = new BookBuilder()
                .setName("Идиот")
                .setPrice(300)
                .setWeight(250)
                .build();

        assertEquals("Идиот", Anna_Karenina.getName());
        assertEquals(300, Anna_Karenina.getPrice());
        assertEquals(250, Anna_Karenina.getWeight());
    }

    @Test
    void setName() {
        builder.setName("Идиот");
        assertEquals("Идиот", builder.getName());
    }

    @Test
    void setPrice() {
        builder.setPrice(300);
        assertEquals(300, builder.getPrice());
    }

    @Test
    void setWeight() {
        builder.setWeight(250);
        assertEquals(250, builder.getWeight());
    }
}