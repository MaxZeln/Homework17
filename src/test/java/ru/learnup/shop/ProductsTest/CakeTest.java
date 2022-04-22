package ru.learnup.shop.ProductsTest;

import ru.learnup.shop.Products.Cake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CakeTest {

    Cake cake;

    @BeforeEach
    public void createCake() {
        cake = new Cake("Шоколадный", 400, 500, 7);
    }



    @Test
    void getName() {
        assertEquals("Шоколадный", cake.getName());
    }

    @Test
    void setName() {
        cake.setName("Шоколадный с крошкой");
        assertEquals("Шоколадный с крошкой", cake.getName());
    }

    @Test
    void getPrice() {
        assertEquals(400, cake.getPrice());
    }

    @Test
    void setPrice() {
        cake.setPrice(450);
        assertEquals(450, cake.getPrice());
    }

    @Test
    void getWeight() {
        assertEquals(500, cake.getWeight());
    }

    @Test
    void setWeight() {
        cake.setWeight(550);
        assertEquals(550, cake.getWeight());
    }

    @Test
    void getExpiration_date() {
        assertEquals(7, cake.getExpiration_date());
    }

    @Test
    void setExpiration_date() {
        cake.setExpiration_date(8);
        assertEquals(8, cake.getExpiration_date());
    }

    @Test
    void getCategory() {
        assertEquals("cake", cake.getCategory());
    }

    @Test
    void setCategory() {
        cake.setCategory("party cake");
        assertEquals("party cake", cake.getCategory());
    }
}