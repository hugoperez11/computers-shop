package dev.hugo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ComputerTest {

    private Computer computer;

    @BeforeEach
    public void setUp() {
        
        computer = new Computer("BrandX", 16, "Intel i7", "Windows 10", 1200.0);
    }

    @Test
    public void testGetBrand() {
        assertThat(computer.getBrand(), is(equalTo("BrandX")));
    }

    @Test
    public void testSetBrand() {
        computer.setBrand("BrandY");
        assertThat(computer.getBrand(), is(equalTo("BrandY")));
    }

    @Test
    public void testGetMemory() {
        assertThat(computer.getMemory(), is(equalTo(16)));
    }

    @Test
    public void testSetMemory() {
        computer.setMemory(32);
        assertThat(computer.getMemory(), is(equalTo(32)));
    }

    @Test
    public void testGetProcessor() {
        assertThat(computer.getProcessor(), is(equalTo("Intel i7")));
    }

    @Test
    public void testSetProcessor() {
        computer.setProcessor("AMD Ryzen 7");
        assertThat(computer.getProcessor(), is(equalTo("AMD Ryzen 7")));
    }

    @Test
    public void testGetOperatingSystem() {
        assertThat(computer.getOperatingSystem(), is(equalTo("Windows 10")));
    }

    @Test
    public void testSetOperatingSystem() {
        computer.setOperatingSystem("Linux");
        assertThat(computer.getOperatingSystem(), is(equalTo("Linux")));
    }

    @Test
    public void testGetPrice() {
        assertThat(computer.getPrice(), is(equalTo(1200.0)));
    }

    @Test
    public void testSetPrice() {
        computer.setPrice(1400.0);
        assertThat(computer.getPrice(), is(equalTo(1400.0)));
    }

    @Test
    public void testToString() {
        String expectedString = "Computer [brand=BrandX, memory=16GB, processor=Intel i7, operatingSystem=Windows 10, price=1200.0]";
        assertThat(computer.toString(), is(equalTo(expectedString)));
    }
}

