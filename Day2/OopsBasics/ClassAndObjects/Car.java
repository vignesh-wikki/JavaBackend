// Create a class Car with attributes like brand, model, and price.Write methods to display details of a car and calculate
// the discounted price.

package Day2.OopsBasics.ClassAndObjects;

public class Car {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void CalulatingDiscountingPrice(int price) {
        System.out.println("Car disounted price: " + (this.price - price));
    }

    public void displayingCarSpecifications() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car price: " + price);
    }

    public static void main(String[] args) {
        Car obj = new Car("BMW", "XE", 1000000);
        obj.displayingCarSpecifications();
        obj.CalulatingDiscountingPrice(100000);

    }
}
