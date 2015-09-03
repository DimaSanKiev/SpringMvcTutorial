package ua.burdyga._9_ajax._1_json_response.model;

import java.math.BigDecimal;

public class Item {

    private final int id;
    private final String description;
    private final String name;
    private final BigDecimal price;
    private String image;

    public Item(int id, String description, String name, BigDecimal price) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public static Item getInstance(int id, String name, String description, BigDecimal price) {
        Item item = new Item(id, name, description, price);
        return item;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
