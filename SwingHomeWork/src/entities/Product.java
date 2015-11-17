package entities;

public class Product {
    private int price;
    private String name;
    private int weight;
    private String manufacturer;
    private String category;

    public Product(int price, String name, int weight, String manufacturer, String category) {
        this.price = price;
        this.name = name;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public String getName() {return name;}

    public void setName() {this.name = name;}

    public int getWeight() {return weight;}

    public void setWeight() {this.weight = weight;}

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {return category;}

    public void setCategory() {this.category = category;}
}