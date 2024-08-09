package dev.hugo;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

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
    public void testAddComputer() {
        Computer computer = new Computer("BrandX", 16, "Intel i7", "Windows 10", 1200.0);
        shop.addComputer(computer);
        assertThat(shop.getComputers(), hasItem(computer));
    }

    @Test
    public void testRemoveComputerByBrand_Success() {
        // Añadir algunos ordenadores a la tienda
        shop.addComputer(new Computer("Asus", 16, "Intel i7", "Windows 10", 1200.0));
        shop.addComputer(new Computer("HP", 8, "Intel i5", "Windows 10", 800.0));
        shop.addComputer(new Computer("Dell", 32, "Intel i9", "Windows 11", 2000.0));
       
    
        // Verifica que hay tres ordenadores antes de eliminar uno
        assertThat(shop.getComputers(), hasSize(3));
        assertThat(shop.getComputers(), hasItem(hasProperty("brand", is("Dell"))));
    
        // Intenta eliminar un ordenador de marca "Dell"
        boolean result = shop.removeComputer("Dell");
    
        // Verifica que el ordenador fue eliminado
        assertThat(result, is(true));
        assertThat(shop.getComputers(), hasSize(2));
       
    }
    

    @Test
    public void testFindComputerByBrand() {
        Computer computer = new Computer("BrandX", 16, "Intel i7", "Windows 10", 1200.0);
        shop.addComputer(computer);
        Computer foundComputer = shop.findComputerByBrand("BrandX");
        assertThat(foundComputer, is(equalTo(computer)));
    }

    @Test
    public void testListAllComputers() {
        // Crear las computadoras que deseas agregar
        Computer computer1 = new Computer("BrandX", 16, "Intel i7", "Windows 10", 1200.0);
        Computer computer2 = new Computer("BrandY", 8, "Intel i5", "Windows 10", 800.0);

        // Agregar las computadoras a la tienda
        shop.addComputer(computer1);
        shop.addComputer(computer2);

        // Obtener la lista de todas las computadoras
        List<Computer> allComputers = shop.listAllComputers();

        // Verificar que el tamaño de la lista sea 2
        assertThat(allComputers, hasSize(2));

        // Verificar que la lista contenga las computadoras esperadas en cualquier orden
        assertThat(allComputers, containsInAnyOrder(computer1, computer2));
    }
}