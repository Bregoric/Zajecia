public class Car {
    private double weight;
    private double price;
    private String color;


    public Car(double weight, double price, String color) {
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

