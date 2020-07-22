public class Car {

    public int id;
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;
    public String registrationNumber;

    public Car(int id, String brand, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;


    }

    @Override
    public String toString() {
        return "id=" + id +
                ", brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                ", color=" + color +
                ", price=" + CarProcessor.roundPrice(price) + "$" +
                ", registrationNumber=" + registrationNumber;


    }
}
