package dev.hugo;

import java.util.ArrayList;
import java.util.List;


public class Shop {
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public Shop(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }




    
   //Computer es la plantilla(objeto) , computer es el objeto real al q me refiero
    public void addComputer(Computer computer) {
        computers.add(computer);//a la lista computers, añademe un computer
    }

    
    public boolean removeComputerByBrand(String brand) {
        for (int i = 0; i < computers.size(); i++) {
            Computer computer = computers.get(i);
            if (computer.getBrand().equals(brand)) {
                computers.remove(i); // Elimina el primer ordenador con la marca dada, solo elimina uno
                return true; // Retorna true porque se eliminó un ordenador
            }
        }
        return false; // Retorna false si no se encontró ningún ordenador con la marca dada
    }

    
    public Computer findComputerByBrand(String brand) {
        return computers.stream()
                        .filter(computer -> computer.getBrand().equals(brand))
                        .findFirst()
                        .orElse(null);
    }

    
    public List<Computer> listAllComputers() {
        return new ArrayList<>(computers);
    }
}
