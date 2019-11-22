package pojo;

import java.util.Date;

public class Product {
    private Integer id;
     private String name;
     private float time;
     private Date price;
     private String brand;

    public Product(Integer id, String name, float time, Date price, String brand) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.price = price;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public Date getPrice() {
        return price;
    }

    public void setPrice(Date price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
