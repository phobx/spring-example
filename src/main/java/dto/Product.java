package dto;

public class Product {

    private int id;
    private String name;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Product(int id, String name) {
	this.id = id;
	this.name = name;
    }

    public Product() {
    }

    @Override
    public String toString() {
	return "Product ID: " + id + "\t Product Name: " + name;
    }

}
