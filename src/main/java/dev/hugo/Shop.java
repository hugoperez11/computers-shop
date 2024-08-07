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

  




}
