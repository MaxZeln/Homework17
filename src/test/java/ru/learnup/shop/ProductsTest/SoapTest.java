package ru.learnup.shop.ProductsTest;

import ru.learnup.shop.Products.Soap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoapTest {

    Soap soap;

    @BeforeEach
    public void createSoap() {
        soap = new Soap("Лавандовое", 120, 100);
    }


    @Test
    void getName() {
        assertEquals("Лавандовое", soap.getName());

    }

    @Test
    void setName() {
        soap.setName("Ромашковое");
        assertEquals("Ромашковое", soap.getName());
    }

    @Test
    void getPrice() {
        assertEquals(120, soap.getPrice());
    }

    @Test
    void setPrice() {
        soap.setPrice(110);
        assertEquals(110, soap.getPrice());
    }

    @Test
    void getWeight() {
        assertEquals(100, soap.getWeight());
    }

    @Test
    void setWeight() {
        soap.setWeight(90);
        assertEquals(90, soap.getWeight());
    }

    @Test
    void getExpiration_date() {
        assertEquals(-1, soap.getExpiration_date());
    }

    @Test
    void setExpiration_date() {
        soap.setExpiration_date(100);
        assertEquals(100, soap.getExpiration_date());
    }

    @Test
    void getCategory() {
        assertEquals("soap", soap.getCategory());
    }

    @Test
    void setCategory() {
        soap.setCategory("bath soap");
        assertEquals("bath soap", soap.getCategory());
    }
}