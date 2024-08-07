package dev.hugo;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop("PepeComp", "Pepe", "123");
    }

    @Test
    void testGetName() {
        assertThat(shop.getName(), is("PepeComp"));        
    }
     @Test
    public void testSetName() {
        shop.setName("NewName");
        assertThat(shop.getName(), is("NewName"));
    }

    @Test
    public void testGetOwner() {
        assertThat(shop.getOwner(), is("Pepe"));
    }

    @Test
    public void testSetOwner() {
        shop.setOwner("NewOwner");
        assertThat(shop.getOwner(), is("NewOwner"));
    }

    @Test
    public void testGetTaxId() {
        assertThat(shop.getTaxId(), is("123"));
    }

    @Test
    public void testSetTaxId() {
        shop.setTaxId("newTaxId");
        assertThat(shop.getTaxId(), is("newTaxId"));
    }

    @Test
    public void testGetComputers() {
        assertThat(shop.getComputers(), is(notNullValue()));
        assertThat(shop.getComputers(), is(empty()));
    }   

}
