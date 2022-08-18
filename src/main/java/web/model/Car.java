package web.model;

public class Car {

    private String brand;

    private String model;

    private int yearOfManufactured;

    public Car() {
    }

    public Car(String brand, String model, int yearOfManufactured) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufactured = yearOfManufactured;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }

    public void setYearOfManufactured(int yearOfManufactured) {
        this.yearOfManufactured = yearOfManufactured;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + yearOfManufactured;
    }
}
